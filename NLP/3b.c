#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_WORDS 100
#define MAX_TAGS 50
#define MAX_LENGTH 50

char tagList[MAX_TAGS][MAX_LENGTH];
int tagFreq[MAX_TAGS];
int tagCount = 0;

char wordList[MAX_WORDS][MAX_LENGTH];
int wordCount = 0;

int emission[MAX_TAGS][MAX_WORDS];
int transitions[MAX_TAGS][MAX_TAGS];
int transitionCount[MAX_TAGS];

int get_tag_index(char tag[]) {
for (int i = 0; i < tagCount; i++) {
if (strcmp(tagList[i], tag) == 0) {
return i;
}
}
strcpy(tagList[tagCount], tag);
tagFreq[tagCount] = 0;
return tagCount++;
}

int get_word_index(char word[]) {
for (int i = 0; i < wordCount; i++) {
if (strcmp(wordList[i], word) == 0) {
return i;
}
}
strcpy(wordList[wordCount], word);
return wordCount++;
}

void update_transition(char prevTag[], char currTag[]) {
int prevIndex = get_tag_index(prevTag);
int currIndex = get_tag_index(currTag);
transitions[prevIndex][currIndex]++;
transitionCount[prevIndex]++;
}

int main() {
int n;
char line[256];
char word[MAX_LENGTH], tag[MAX_LENGTH];
char prevTag[MAX_LENGTH];

printf("Enter number of training sentences: ");
scanf("%d", &n);
getchar();

for (int i = 0; i < n; i++) {
    prevTag[0] = '\0';
    printf("Enter training sentence %d (with POS tags): ", i + 1);
    scanf(" %[^\n]s", line);



char *token = strtok(line, " ");
while (token != NULL) {
int len = strlen(token);
int slashPos = -1;

for (int j = len - 1; j >= 0; j--) {
if (token[j] == '/') {
slashPos = j;
break;
}
}

if (slashPos == -1) {
break;
}

token[slashPos] = '\0';
strcpy(tag, token + slashPos + 1);
strcpy(word, token);

int tagIndex = get_tag_index(tag);
int wordIndex = get_word_index(word);
tagFreq[tagIndex]++;
emission[tagIndex][wordIndex]++;

if (prevTag[0] != '\0') {
update_transition(prevTag, tag);
}

strcpy(prevTag, tag);
token = strtok(NULL, " ");
}
}

printf("\nEmission Probabilities:\n");
for (int i = 0; i < tagCount; i++) {
for (int j = 0; j < wordCount; j++) {
if (emission[i][j] > 0) {
double prob = (double)emission[i][j] / tagFreq[i];
printf("P(%s | %s) = %.4f\n", wordList[j], tagList[i], prob);
}
}
}

printf("\nTransition Probabilities:\n");
for (int i = 0; i < tagCount; i++) {
for (int j = 0; j < tagCount; j++) {
if (transitions[i][j] > 0) {
double prob = (double)transitions[i][j] / transitionCount[i];
printf("P(%s | %s) = %.4f\n", tagList[j], tagList[i], prob);
}
}
}

printf("\nEnter number of words in test sentence: ");
int testLen;
scanf("%d", &testLen);
getchar();

printf("Enter test sentence: ");
fgets(line, sizeof(line), stdin);
line[strcspn(line, "\n")] = 0;

int pos = 0;
double jointProb = 1.0;
strcpy(prevTag, "<s>");

while (sscanf(line + pos, "%s", word) == 1) {
double maxProb = 0.0;
char bestTag[MAX_LENGTH] = "";

int wordIndex = -1;
for (int j = 0; j < wordCount; j++) {
if (strcmp(wordList[j], word) == 0) {
wordIndex = j;
break;
}
}

if (wordIndex == -1) {
printf("Unknown word '%s' encountered. Skipping...\n", word);
pos += strlen(word) + 1;
continue;
}

int prevIndex = get_tag_index(prevTag);
for (int i = 0; i < tagCount; i++) {
if (emission[i][wordIndex] == 0)
continue;

double emissionProb = (double)emission[i][wordIndex] / tagFreq[i];
double transitionProb = (transitionCount[prevIndex] > 0 && transitions[prevIndex][i] > 0)
? (double)transitions[prevIndex][i] / transitionCount[prevIndex]
: 0.0;

double prob = emissionProb * transitionProb;
if (prob > maxProb) {
maxProb = prob;
strcpy(bestTag, tagList[i]);
}
}

if (maxProb == 0.0) {
printf("No valid tag found for '%s'. Skipping...\n", word);
pos += strlen(word) + 1;
continue;
}

jointProb *= maxProb;
strcpy(prevTag, bestTag);
pos += strlen(word) + 1;
}

printf("Joint Probability: %.10f\n", jointProb);
return 0;
}
