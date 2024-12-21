#include <stdio.h>

int main()
{
    int value = 10;
    int *ptr = &value;
    int **ptrToPtr = &ptr;

    printf("Value using ptr: %d\n", *ptr);
    printf("Value using ptrToPtr: %d\n", **ptrToPtr);

    **ptrToPtr = 20;

    printf("Modified value: %d\n", value);

    return 0;
}
