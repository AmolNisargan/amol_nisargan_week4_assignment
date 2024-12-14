---

# Java Collections and Exception Handling

This repository contains programs demonstrating the use of Java Collections framework and exception handling techniques. The assignment includes three tasks: managing a list of students, working with a `HashMap` for employee details, and handling multiple exceptions including custom exceptions.

## Table of Contents
- [Overview](#overview)
- [Task 1: ArrayList Student Management](#task-1-arraylist-student-management)
- [Task 2: HashMap Employee Management](#task-2-hashmap-employee-management)
- [Task 3: Exception Handling with Custom Exceptions](#task-3-exception-handling-with-custom-exceptions)
- [How to Run](#how-to-run)
- [Technologies Used](#technologies-used)

---

## Overview
This project explores:
1. Using `ArrayList` to manage a dynamic list of students.
2. Leveraging `HashMap` for efficient storage and retrieval of employee details.
3. Handling multiple exceptions (`ArithmeticException`, `NullPointerException`, etc.) and implementing custom exceptions.

---

## Task 1: ArrayList Student Management
- **Features**:
  - Add a student.
  - Remove a student by name.
  - Display the list of students.

- **Code Snippet**:
```java
ArrayList<String> students = new ArrayList<>();
students.add("Alice");
students.remove("Bob");
System.out.println(students);
```

---

## Task 2: HashMap Employee Management
- **Features**:
  - Store employee details using their ID as the key.
  - Retrieve employee details by ID.

- **Code Snippet**:
```java
HashMap<Integer, String> employees = new HashMap<>();
employees.put(101, "Alice");
System.out.println(employees.get(101));
```

---

## Task 3: Exception Handling with Custom Exceptions
- **Features**:
  - Handle `ArithmeticException` (e.g., division by zero).
  - Handle `NullPointerException` (e.g., accessing null objects).
  - Define and throw a custom exception.

- **Custom Exception**:
```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
```

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/AmolNisargan/amol_nisargan_week4_assignment
   ```
2. Navigate to the project directory:
   ```bash
   cd amol_nisargan_week4_assignment
   ```
3. Compile and run each program using `javac` and `java` commands, or use an IDE like IntelliJ IDEA or Eclipse.

---

## Technologies Used
- **Programming Language**: Java
- **Tools**: JDK, IntelliJ IDEA/Eclipse, Command Line

---

Feel free to contribute to this project by submitting issues or pull requests. 😊

---
