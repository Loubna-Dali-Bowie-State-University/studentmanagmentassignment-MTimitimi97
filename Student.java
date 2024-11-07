public class Student {
    // Attributes
    private String name;
    private int id;
    private int[] grades;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.grades = new int[0]; // Empty array by default
    }

    // Parameterized constructor
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        setGrades(grades); // Use setter to apply validation
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        // Validate grades before setting
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                System.out.println("Error: Grade " + grade + " is out of range. Ignoring this grade.");
            }
        }

        // Assign the valid grades to the attribute
        this.grades = grades;
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades.length == 0) {
            return 0; // Return 0 if no grades are available
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }
}