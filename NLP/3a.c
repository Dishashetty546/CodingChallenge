#include <stdio.h>
#include <string.h>

void getTag(char word[], char tag[])
{
    if (strcmp(word, "The") == 0 || strcmp(word, "a") == 0)
    {
        strcpy(tag, "DT");
    }
    else if (strcmp(word, "is") == 0 || strcmp(word, "are") == 0)
    {
        strcpy(tag, "VB");
    }
    else if (strcmp(word, "and") == 0 || strcmp(word, "or") == 0 || strcmp(word, "but") == 0)
    {
        strcpy(tag, "CC");
    }
    else if (strstr(word, "tion") || strstr(word, "ment") || strstr(word, "ness"))
    {
        strcpy(tag, "NN");
    }
    else if (strstr(word, "ly"))
    {
        strcpy(tag, "RB");
    }
    else if (strstr(word, "ing") || strstr(word, "ed"))
    {
        strcpy(tag, "VB");
    }
    else if (strstr(word, "able") || strstr(word, "ful"))
    {
        strcpy(tag, "JJ");
    }
    else if (strcmp(word, "new") == 0)
    {
        strcpy(tag, "JJ");
    }
    else if (strcmp(word, "very") == 0)
    {
        strcpy(tag, "RB");
    }
    else
    {
        printf("Enter tag for '%s': ", word);
        scanf("%s", tag);
    }
}

int main()
{
    char sentence[256];
    char word[50];
    char tag[10];
    int i = 0, j = 0;

    printf("Enter a sentence: ");
    fgets(sentence, sizeof(sentence), stdin);

    printf("Tagged sentence: ");
    while (sentence[i] != '\0')
    {
        if (sentence[i] == ' ' || sentence[i] == '.' || sentence[i] == ',')
        {
            if (j > 0)
            {
                word[j] = '\0';
                getTag(word, tag);
                printf("%s/%s ", word, tag);
                j = 0;
            }
            if (sentence[i] == '.')
                break;
        }
        else
        {
            word[j++] = sentence[i];
        }
        i++;
    }

    // Handle the last word if not followed by punctuation
    if (j > 0)
    {
        word[j] = '\0';
        getTag(word, tag);
        printf("%s/%s ", word, tag);
    }

    return 0;
}
