// StudentOperations.java

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


}