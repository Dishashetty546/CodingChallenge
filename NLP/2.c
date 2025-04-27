#include <stdio.h>
#include <string.h>

#define MAX_WORDS 100
#define MAX_WORD_LENGTH 50

// Tokenize the sentence into words
int tokenize(char sentence[], char words[][MAX_WORD_LENGTH])
{
    int count = 0;
    int i = 0, j = 0;

    while (1)
    {
        if (sentence[i] != ' ' && sentence[i] != '\0')
        {
            words[count][j++] = sentence[i];
        }
        else
        {
            words[count][j] = '\0'; // End current word
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

// Count bigram occurrences
int count_bigram(char words[][MAX_WORD_LENGTH], int count, char w1[], char w2[])
{
    int bigram_count = 0;
    for (int i = 0; i < count - 1; i++)
    {
        if (strcmp(words[i], w1) == 0 && strcmp(words[i + 1], w2) == 0)
        {
            bigram_count++;
        }
    }
    return bigram_count;
}

// Count unigram occurrences
int count_unigram(char words[][MAX_WORD_LENGTH], int count, char w1[])
{
    int unigram_count = 0;
    for (int i = 0; i < count; i++)
    {
        if (strcmp(words[i], w1) == 0)
        {
            unigram_count++;
        }
    }
    return unigram_count;
}

// Count unique words in vocabulary
int count_unique_words(char words[][MAX_WORD_LENGTH], int count)
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

// Calculate smoothed bigram probability
double bigram_probability(char words[][MAX_WORD_LENGTH], int count, char w1[], char w2[], int vocab_size)
{
    int bigram_count = count_bigram(words, count, w1, w2);
    int unigram_count = count_unigram(words, count, w1);

    return (double)(bigram_count + 1) / (unigram_count + vocab_size);
}

// Compute final sentence probability with smoothing
double compute_final_probability(char train_words[][MAX_WORD_LENGTH], int train_count, char test_words[][MAX_WORD_LENGTH], int test_count, int vocab_size)
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
    char training_corpus[] = "There is a big garden Children play in a big garden They play inside beautiful garden";
    char test_sentence[] = "They play in a big garden";

    char train_words[MAX_WORDS][MAX_WORD_LENGTH];
    char test_words[MAX_WORDS][MAX_WORD_LENGTH];

    int train_count = tokenize(training_corpus, train_words);
    int test_count = tokenize(test_sentence, test_words);

    int vocab_size = count_unique_words(train_words, train_count);

    printf("Smoothed Bigram Probabilities:\n");
    for (int i = 0; i < test_count - 1; i++)
    {
        double prob = bigram_probability(train_words, train_count, test_words[i], test_words[i + 1], vocab_size);
        printf("P(%s|%s) = %.3lf\n", test_words[i + 1], test_words[i], prob);
    }

    double final_prob = compute_final_probability(train_words, train_count, test_words, test_count, vocab_size);
    printf("\nFinal probability of test sentence: %.10lf\n", final_prob);

    return 0;
}
