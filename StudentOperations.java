import java.util.*;

class Student {
    String prn, name, dob;
    double marks;

    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public void display() {
        System.out.println("\nPRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("DoB: " + dob);
        System.out.println("Marks: " + marks);
    }
}

class StudentOperations {
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine().trim();
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter DoB: ");
        String dob = sc.nextLine().trim();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();  // Consume newline
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
        String prn = sc.nextLine().trim();
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
        String name = sc.nextLine().trim();
        boolean found = false;

        for (Student s : students) {
            if (s.name.trim().equalsIgnoreCase(name)) {  // Fixed case sensitivity issue
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public void searchByPosition() {
        System.out.print("Enter Position to search: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number.");
            sc.next();
            return;
        }

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
        String prn = sc.nextLine().trim();
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine().trim();
                System.out.print("Enter New DoB: ");
                s.dob = sc.nextLine().trim();
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
        String prn = sc.nextLine().trim();
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.prn.equals(prn)) {
                iterator.remove();
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}
