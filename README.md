# Student Class in Java

## Overview
This project includes a Java class called Student, which represents a student with a name and a grade. Data validation ensures that the grade falls within the permitted range (0-100).

## Features
- Private attributes `name` and `grade` to store student information.
- Public getter and setter methods for controlled access.
- Grade validation to ensure values stay within the range of 0 to 100. If an invalid grade is provided, it defaults to 0.
- A constructor to initialize student objects with a name and a grade.

## Code Structure
The `Student` class contains:
- **Attributes**: `name` (String), `grade` (int)
- **Constructor**: Initializes the `Student` object with given values.
- **Getter Methods**: `getName()`, `getGrade()`
- **Setter Methods**: `setName(String name)`, `setGrade(int grade)` (with validation)
- **Main Method** (for testing purposes): Creates a `Student` object and prints its attributes.

```

## Compilation & Execution
1. Save the class as `Student.java`.
2. Compile it using:
   javac Student.java
3. Run it using:
   java Student
  

