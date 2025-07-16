#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_WORDS 100
#define MAX_WORD_LENGTH 50

int tokenize(char sentence[], char words[][MAX_WORD_LENGTH])
{
    int count = 0;
    int i = 0;
    int j = 0;
    while (1)
    {
        if (sentence[i] != ' ' && sentence[i] != '\0')
        {
            words[count][j] = sentence[i];
            j++;
        }
        else
        {
            words[count][j] = '\0';
            count++;
            j = 0;
            if (sentence[i] == '\0')
            {
                break;
            }
        }
        i++;
    }
    return count;
}

int bigram_counting(char words[][MAX_WORD_LENGTH], int count, char w1[], char w2[])
{
    int bigram_c = 0;
    for (int i = 0; i < count - 1; i++)
    {
        if (strcmp(words[i], w1) == 0 && strcmp(words[i + 1], w2) == 0)
        {
            bigram_c++;
        }
    }
    return bigram_c;
}

int unigram_counting(char words[][MAX_WORD_LENGTH], int count, char w1[])
{
    int unigram_c = 0;
    for (int i = 0; i < count; i++)
    {
        if (strcmp(words[i], w1) == 0)
        {
            unigram_c++;
        }
    }
    return unigram_c;
}

double bigram_probability(char words[][MAX_WORD_LENGTH], int count, char w1[], char w2[])
{
    int bigram_c = bigram_counting(words, count, w1, w2);
    int unigram_c = unigram_counting(words, count, w1);
    if (unigram_c == 0)
    {
        return 0.0;
    }
    else
    {
        return (double)bigram_c / unigram_c;
    }
}

double final_probability(char training_words[MAX_WORDS][MAX_WORD_LENGTH], int training_count, char test_words[MAX_WORDS][MAX_WORD_LENGTH], int test_count)
{
    double probability = 1.0;
    for (int i = 0; i < test_count - 1; i++)
    {
        double prob = bigram_probability(training_words, training_count, test_words[i], test_words[i + 1]);
        probability *= prob;
    }
    return probability;
}

int main()
{
    char training_sen[256];
    char test_sen[256];
    char training_words[MAX_WORDS][MAX_WORD_LENGTH];
    char test_words[MAX_WORDS][MAX_WORD_LENGTH];

    printf("Enter training sentence: ");
    scanf(" %[^\n]", training_sen);
    getchar(); // to consume newline
    printf("Enter test sentence: ");
    scanf(" %[^\n]", test_sen);

    int training_count = tokenize(training_sen, training_words);
    int test_count = tokenize(test_sen, test_words);

    for (int i = 0; i < test_count - 1; i++)
    {
        double prob = bigram_probability(training_words, training_count, test_words[i], test_words[i + 1]);
        printf("Bigram probability of \"%s %s\": %f\n", test_words[i], test_words[i + 1], prob);
    }

    double final_prob = final_probability(training_words, training_count, test_words, test_count);
    printf("Final sentence probability: %f\n", final_prob);

    return 0;
}
