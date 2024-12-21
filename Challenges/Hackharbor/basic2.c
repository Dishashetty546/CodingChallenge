/*this is to understand pre-proces */
#include <stdio.h>
#define PI 3.14
int add(int a, int b);
int main()
{
    int result;
    printf("the value  of PI is: %2.f\n", PI);
    result = add(5, 10);
    printf("The sum is:%d\n", result);
    return 0;
}
int add(int a, int b)
{
    return a + b;
}
