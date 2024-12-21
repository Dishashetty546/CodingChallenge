#include <stdio.h>
#include <string.h>
// Define a union
union Data
{
    int i;
    float f;
    char str[20];
};
int main()
{
    // Declare a union variable
    union Data data;
    // Assign and print integer value
    data.i = 10;
    printf("data.i: %d\n", data.i);
    // Assign and print float value
    data.f = 220.5;
    printf("data.f: %.2f\n", data.f);
    // Assign and print string value
    strcpy(data.str, "Hello");
    printf("data.str: %s\n", data.str);
    // Accessing the previous values will show garbage data because the memory is shared
    printf("data.i after assigning string: %d\n", data.i);   // Will print garbage value
    printf("data.f after assigning string: %.2f\n", data.f); // Will print garbage value
    return 0;
}
