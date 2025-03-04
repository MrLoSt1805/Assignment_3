// StudentOperations.java

import java.util.*;

class StudentOperations {
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter DoB: ");
        String dob = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student Added Successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = sc.nextLine();
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void searchByPosition() {
        System.out.print("Enter Position to search: ");
        int pos = sc.nextInt();
        sc.nextLine();
        if (pos >= 1 && pos <= students.size()) {
            students.get(pos - 1).display();
        } else {
            System.out.println("Invalid position!");
        }
    }

    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = sc.nextLine();
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter New DoB: ");
                s.dob = sc.nextLine();
                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();
                sc.nextLine();
                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.nextLine();
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                students.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
}
    