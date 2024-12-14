package Week_4_Assignment;
/*Create a program that uses a HashMap to store
and retrieve employee details based on their
employee ID.*/
import java.util.HashMap;
import java.util.Scanner;

class Employee {
    String name;
    String department;
    double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display employee details
    public void display() {
        System.out.println("Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    // HashMap to store employee data with EmployeeID as key
    private HashMap<Integer, Employee> employeeMap;

    // Constructor
    public EmployeeManagement() {
        employeeMap = new HashMap<>();
    }

    // Method to add an employee
    public void addEmployee(int id, String name, String department, double salary) {
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee ID already exists. Try a different ID.");
            return;
        }
        Employee employee = new Employee(name, department, salary);
        employeeMap.put(id, employee);
        System.out.println("Employee added with ID: " + id);
    }

    // Method to retrieve an employee by ID
    public void getEmployee(int id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println("Employee details for ID " + id + ":");
            employee.display();
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Method to display all employees
    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("All Employee Details:");
            for (Integer id : employeeMap.keySet()) {
                System.out.print("ID: " + id + ", ");
                employeeMap.get(id).display();
            }
        }
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();

        while (true) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add an employee
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    management.addEmployee(id, name, department, salary);
                    break;

                case 2:
                    // Get employee by ID
                    System.out.print("Enter Employee ID: ");
                    int searchId = scanner.nextInt();
                    management.getEmployee(searchId);
                    break;

                case 3:
                    // Display all employees
                    management.displayAllEmployees();
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
