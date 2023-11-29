import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Student ID: " + studentId;
    }
}

class RegistrationSystem {
    private ArrayList<Student> students;

    public RegistrationSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int age, String studentId) {
        Student student = new Student(name, age, studentId);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
        } else {
            System.out.println("List of registered students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            RegistrationSystem registrationSystem = new RegistrationSystem();

            while (true) {
                System.out.println("\nStudent Registration System");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter student ID: ");
                        String studentId = scanner.nextLine();

                        registrationSystem.addStudent(name, age, studentId);
                        break;
                    case 2:
                        registrationSystem.viewStudents();
                        break;
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }
}
