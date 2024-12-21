#include <stdio.h>
int main()
{
    int num = 15;
    int *ptr = &num;
    printf("Value of num: %d\n", num);
    printf("Address of num: %p\n", (void *)&num);
    printf("Value stored in ptr: %p\n", (void *)ptr);
    printf("Value pointed by ptr: %d\n", *ptr);
    return 0;
}
