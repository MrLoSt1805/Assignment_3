// student.java
// Name: Daniel John Jacob
// PRN: 23070126027
// Batch: AIML A2, 2023-27

import java.util.*;

class Student {
    String prn;
    String name;
    String dob;
    double marks;

    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DoB: " + dob + ", Marks: " + marks);
    }
}