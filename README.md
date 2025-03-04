# Student Management System

*Name :*`Daniel John Jacob`

*PRN :*`23070126027`

*Batch :*`A2`

## Introduction

This is a simple **Java-based Student Management System** that allows users to:

- Add new students
- Display all students
- Search students (by PRN, Name, or Position)
- Update student details
- Delete students

The program follows **OOP principles**, using classes, objects, constructors, and ArrayLists.

---

## Project Structure

The project consists of **three Java files**:

1. **`Main.java`** - Contains the main menu and handles user interaction.
2. **`Student.java`** - Defines the `Student` class with attributes like PRN, Name, DOB, and Marks.
3. **`StudentOperations.java`** - Manages the list of students and implements the core functionalities.

---

## Features

- **Add Student** (PRN, Name, DOB, Marks)
- **Display All Students**
- **Search Student** (By PRN, Name, or Position)
- **Update Student Details**
- **Delete Student by PRN**
- **Menu-driven Program**

---

## Code Overview

### `Student.java`

- **Attributes:**
  - `PRN` (long) - Unique identifier for the student.
  - `Name` (String) - Student's full name.
  - `DOB` (String) - Date of birth in YYYY-MM-DD format.
  - `Marks` (double) - Marks obtained by the student.
- **Methods:**
  - `getPRN()`, `getName()`, `getDoB()`, `getMarks()` - Getters for accessing attributes.
  - `setName(String name)`, `setDoB(String dob)`, `setMarks(double marks)` - Setters to modify attributes.
  - `display()` - Prints student details.

### `StudentOperations.java`

- **Attributes:**
  - `ArrayList<Student> students` - Stores the list of students.
  - `Scanner scan` - Used for user input.
- **Methods:**
  - `addStudent(Student student)` - Adds a student to the list.
  - `displayStudents()` - Displays all students in the list.
  - `searchByPRN(long prn)` - Searches for a student by PRN and displays details.
  - `searchByName(String name)` - Searches for students by name.
  - `searchByPosition(int pos)` - Retrieves a student by index in the list.
  - `updateStudent(long prn)` - Updates student details like name, DOB, and marks.
  - `deleteStudent(long prn)` - Deletes a student by PRN.

### `Main.java`

- **Menu-driven interface** to interact with the system.
- **Methods & Functionality:**
  - Displays menu options for users.
  - Calls relevant methods from `StudentOperations.java` based on user input.
  - Uses a `do-while` loop to keep the program running until exit.

