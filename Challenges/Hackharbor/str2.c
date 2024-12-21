#include <stdio.h>
#include <string.h>
int main()
{
    char src[] = "hello world";
    char dest[6];
    strncpy(dest, src, 5);
    printf("the destination string:%s \n ", dest);
    return 0;
}