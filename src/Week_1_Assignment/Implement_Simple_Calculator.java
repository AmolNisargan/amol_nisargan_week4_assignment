package Week_1_Assignment;

import java.util.Scanner;

public class Implement_Simple_Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number");
		double num2 = sc.nextDouble();
		System.out.println("Choose an operation: ");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.print("Enter your choice: ");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			double sum = num1 + num2;
			System.out.println("Addition: " + sum);
			break;
		}
		case 2: {
			double diff = num1 - num2;
			System.out.println("Substraction: " + diff);
			break;
		}
		case 3: {
			double mul = num1 * num2;
			System.out.println("Multiplication: " + mul);
			break;
		}
		case 4: {
			if (num2 != 0) {
				double div = num1 / num2;
				System.out.println("Division: " + div);
			} else {
				System.out.println("Division: Cannot divide by zero");
			}
			break;
		}
		default:
			System.out.println("Invalid choice. Please select a valid operation.");
			break;
		}
		sc.close();
	}
}
