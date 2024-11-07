public class StudentManagement {
    // Array to hold students (up to 5 students for simplicity)
    private Student[] students;
    private int studentCount;

    // Constructor to initialize the student array
    public StudentManagement() {
        students = new Student[5]; // Maximum of 5 students
        studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student added: " + student.getName());
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    // Method to display all students
    public void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Average Grade: " + student.calculateAverage());
        }
    }
}