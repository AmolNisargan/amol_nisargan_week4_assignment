package Week_4_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String department;

    // Constructor
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class StudentManagement {
    // ArrayList to store student data
    private ArrayList<Student> studentList;

    // Constructor
    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String name, int age, String department) {
        Student student = new Student(name, age, department);
        studentList.add(student);
        System.out.println("Student added: " + name);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        boolean removed = false;
        for (Student student : studentList) {
            if (student.name.equalsIgnoreCase(name)) {
                studentList.remove(student);
                System.out.println("Student removed: " + name);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    // Method to display all students
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : studentList) {
                student.display();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        while (true) {
            System.out.println("\nStudent Management System:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add a student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student department: ");
                    String department = scanner.nextLine();
                    management.addStudent(name, age, department);
                    break;

                case 2:
                    // Remove a student
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    management.removeStudent(removeName);
                    break;

                case 3:
                    // Display all students
                    management.displayStudents();
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
