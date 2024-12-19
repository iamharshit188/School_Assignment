public class Student {
    // Fields
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to update GPA
    public void updateGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            gpa = newGpa;
            System.out.println("GPA updated to: " + newGpa);
        } else {
            System.out.println("Invalid GPA value.");
        }
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student myStudent = new Student("S12345", "Alice", 20, 3.5);

        // Updating GPA
        myStudent.updateGpa(3.8);

        // Displaying student information
        myStudent.displayStudentInfo();
    }
}
