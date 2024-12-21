#include <stdio.h>
// Defining a structure for a student
struct Student
{
    int rollNo;
    char name[50];
    float marks;
};
int main()
{
    // Creating an array of structures
    struct Student students[3];
    // Adding data to the array
    students[0].rollNo = 1;
    strcpy(students[0].name, "John");
    students[0].marks = 85.6;

    students[1].rollNo = 2;
    strcpy(students[1].name, "Alice");
    students[1].marks = 90.2;

    students[2].rollNo = 3;
    strcpy(students[2].name, "Bob");
    students[2].marks = 78.4;
    // Printing the data
    for (int i = 0; i < 3; i++)
    {
        printf("Student Roll No: %d\n", students[i].rollNo);
        printf("Student Name: %s\n", students[i].name);
        printf("Student Marks: %.2f\n\n", students[i].marks);
    }
    return 0;
}
