#include <stdio.h>
#include <string.h>
int main()
{
    char src[] = "world";
    char dest[6];
    strcpy(dest, src);
    printf("the destination string is : %s\n  ", dest);
    return 0;
}