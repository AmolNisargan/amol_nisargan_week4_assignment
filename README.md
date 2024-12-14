
Java Collections and Exception Handling
This repository contains programs demonstrating the use of Java Collections framework and exception handling techniques. The assignment includes three tasks: managing a list of students, working with a HashMap for employee details, and handling multiple exceptions including custom exceptions.

Table of Contents
Overview
Task 1: ArrayList Student Management
Task 2: HashMap Employee Management
Task 3: Exception Handling with Custom Exceptions
How to Run
Technologies Used
Overview
This project explores:

Using ArrayList to manage a dynamic list of students.
Leveraging HashMap for efficient storage and retrieval of employee details.
Handling multiple exceptions (ArithmeticException, NullPointerException, etc.) and implementing custom exceptions.
Task 1: ArrayList Student Management
Features:

Add a student.
Remove a student by name.
Display the list of students.
Code Snippet:


ArrayList<String> students = new ArrayList<>();
students.add("Alice");
students.remove("Bob");
System.out.println(students);

Task 2: HashMap Employee Management
Features:

Store employee details using their ID as the key.
Retrieve employee details by ID.
Code Snippet:


HashMap<Integer, String> employees = new HashMap<>();
employees.put(101, "Alice");
System.out.println(employees.get(101));
Task 3: Exception Handling with Custom Exceptions
Features:

Handle ArithmeticException (e.g., division by zero).
Handle NullPointerException (e.g., accessing null objects).
Define and throw a custom exception.


Custom Exception:


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
How to Run
Clone the repository:

git clone https://github.com/AmolNisargan/amol_nisargan_week4_assignment
Navigate to the project directory:

Compile and run each program using javac and java commands, or use an IDE like IntelliJ IDEA or Eclipse.

Technologies Used
Programming Language: Java
Tools: JDK, IntelliJ IDEA/Eclipse, Command Line

Feel free to contribute to this project by submitting issues or pull requests. 😊
