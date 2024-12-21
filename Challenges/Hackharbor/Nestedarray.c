#include <stdio.h>
// Defining a structure for Date
struct Date
{
    int day;
    int month;
    int year;
};
// Defining a structure for Student, which contains a Date structure
struct Student
{
    int rollNo;
    char name[50];
    struct Date dob; // Nested structure
};
int main()
{
    // Declare a Student variable
    struct Student student1;
    // Initialize the student's details
    student1.rollNo = 101;
    strcpy(student1.name, "Alice");
    // Initialize the nested Date structure
    student1.dob.day = 12;
    student1.dob.month = 5;
    student1.dob.year = 2002;
    // Print student details
    printf("Student Roll No: %d\n", student1.rollNo);
    printf("Student Name: %s\n", student1.name);
    printf("Date of Birth: %02d/%02d/%d\n", student1.dob.day, student1.dob.month, student1.dob.year);
    return 0;
}
