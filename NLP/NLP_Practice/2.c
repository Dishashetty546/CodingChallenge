#include <stdio.h>
#include <string.h>

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

int count_unique(char words[][MAX_WORD_LENGTH], int count)
{
    int unique = 0;
    int found;
    for (int i = 0; i < count; i++)
    {
        found = 0;
        for (int j = 0; j < i; j++)
        {
            if (strcmp(words[i], words[j]) == 0)
            {
                found = 1;
                break;
            }
        }
        if (!found)
        {
            unique++;
        }
    }
    return unique;
}

double bigram_probability(char words[][MAX_WORD_LENGTH], int count, char w1[], char w2[], int vocab_size)
{
    int bigram_c = bigram_counting(words, count, w1, w2);
    int unigram_c = unigram_counting(words, count, w1);
    double prob = (double)(bigram_c + 1) / (unigram_c + vocab_size);
    return prob;
}

double final_prob(char train_words[][MAX_WORD_LENGTH], int train_count, char test_words[][MAX_WORD_LENGTH], int test_count, int vocab_size)
{
    double probability = 1.0;
    for (int i = 0; i < test_count - 1; i++)
    {
        double prob = bigram_probability(train_words, train_count, test_words[i], test_words[i + 1], vocab_size);
        probability *= prob;
    }
    return probability;
}
int main()
{
    double prob = 1.0;
    char train_sentence[256];
    char test_sentence[256];
    char train_words[MAX_WORDS][MAX_WORD_LENGTH];
    char test_words[MAX_WORDS][MAX_WORD_LENGTH];
    printf("Enter training sentence:");
    scanf("%[^\n]s", train_sentence);
    getchar();
    printf("enter test sentence:");
    scanf("%[^\n]s", test_sentence);
    getchar();
    int train_count = tokenize(train_sentence, train_words);
    int test_count = tokenize(test_sentence, test_words);
    int vocab_size = count_unique(train_words, train_count);
    prob = final_prob(train_words, train_count, test_words, test_count, vocab_size);
    for (int i = 0; i < test_count - 1; i++)
    {
        double prob = bigram_probability(train_words, train_count, test_words[i], test_words[i + 1], vocab_size);
        printf("P(%s|%s)=%.3lf\n", test_words[i + 1], test_words[i], prob);
    }

    printf("final probability:%.3lf\n", prob);
    return 0;
}