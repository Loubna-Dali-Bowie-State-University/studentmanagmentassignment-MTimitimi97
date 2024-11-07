public class Main {
    public static void main(String[] args) {
        // Create some student objects
        Student student1 = new Student("Alice", 1, new int[]{85, 92, 78});
        Student student2 = new Student("Bob", 2, new int[]{95, 88, 91});
        Student student3 = new Student("Charlie", 3, new int[]{50, 60, 55});
        
        // Create StudentManagement object to manage students
        StudentManagement management = new StudentManagement();

        // Add students to the management system
        management.addStudent(student1);
        management.addStudent(student2);
        management.addStudent(student3);

        // Try to add more students than the array allows
        management.addStudent(new Student("David", 4, new int[]{70, 80, 90}));
        management.addStudent(new Student("Eve", 5, new int[]{90, 80, 70}));
        management.addStudent(new Student("Frank", 6, new int[]{88, 77, 99})); // This will fail because the array is full

        // Display all students' details
        management.displayAllStudents();
    }
}