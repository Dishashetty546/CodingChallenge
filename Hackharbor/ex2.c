#include <stdio.h>
int main()
{
    int arr[5] = {10, 20, 30, 40, 50};
    int *ptr = arr;
    printf("%d\n", *ptr);
    printf("%d\n", (*ptr + 1));
}