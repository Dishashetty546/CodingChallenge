#include <stdio.h>
#include <string.h>
// Structure declaration
struct Student
{
    int rollNumber;
    char name[50];
    float marks;
};
int main()
{
    // Structure variable declaration
    struct Student student1;
    // Assigning values to structure members
    student1.rollNumber = 101;
    student1.marks = 85.5;
    // Using string copy to assign a string to the name member
    strcpy(student1.name, "John Doe");
    // Accessing and printing structure members
    printf("Student Details:\n");
    printf("Name: %s\n", student1.name);
    printf("Roll Number: %d\n", student1.rollNumber);
    printf("Marks: %.2f\n", student1.marks);
    return 0;
}
