#include <stdio.h>
#include <string.h>
int main()
{
    char dest[20] = "Hello";
    char src[] = " World";
    strcat(dest, src);
    printf("Source string to end of dest string : %s\n ", dest);
    return 0;
}