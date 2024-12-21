#include <stdio.h>
void printArray(int *arr, int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", *(arr + i));
    }
    printf("\n");
}
void modifyArray(int *arr, int size)
{
    for (int i = 0; i < size; i++)
    {
        *(arr + i) += 5;
    }
}
int main()
{
    int arr[4] = {1, 2, 3, 4};
    int *ptr = arr;
    printf("Original array: ");
    printArray(ptr, 4);
    modifyArray(ptr, 4);
    printf("Modified array: ");
    printArray(ptr, 4);

    int(*arrPtr)[4] = &arr;
    printf("Array elements using pointer to array: ");
    for (int i = 0; i < 4; i++)
    {
        printf("%d ", (*arrPtr)[i]);
    }
    printf("\n");
    int *start = &arr[0];
    int *end = &arr[3];
    printf("Elements between pointers: %ld\n", end - start);
    return 0;
}
