#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define MAX_WORDS 100
#define MAX_TAGS 50
#define MAX_LENGTH 50

char tagList[MAX_TAGS][MAX_LENGTH];
int tagFreq[MAX_TAGS];
int tagCount=0;

char wordList[MAX_WORDS][MAX_LENGTH];
int wordCount=0;

int emisssion[MAX_TAGS][MAX_WORDS];
int transitions[MAX_TAGS][MAX_TAGS];
int transitionCount[MAX_TAGS];

int get_tag_index(char tag[])
{
    for(int i=0;i<tagCount;i++)
    {
        if(strcmp(tagList[i],tag)==0)
        {
            return i;
        }

    }
    strcpy(tagList[tagCount],tag);
    tagFreq[tagCount]=0;
    return tagCount++;

}
int get_word_index(char word[])
{
    for(int i=0;i<wordCount;i++)
    {
        if(strcmp(wordList[i],word)==0)
        {
            return i;
        }

    }
    strcpy(wordList[wordCount],word);
    return wordCount++;
}

void update_transition(char prevTag[], char currTag[])
{
    int prevTag= get_tag_index(prevTag);
    int currTag= get_tag_index(currTag);
    transitions[prevTag][currTag]++;
    transitionCount[prevTag]++;

}

int main()
{
    
}