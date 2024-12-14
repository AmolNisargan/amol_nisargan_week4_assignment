package Week_1_Assignment;

/*Write a program to perform basic arithmetic operations (addition, subtraction, multiplication,division).*/
import java.util.Scanner;

public class BasicArithmaticOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		double num1 = sc.nextDouble();
		System.out.println("Enter Second Number");
		double num2 = sc.nextDouble();

		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quetient;

		System.out.println("Addition: " + sum);
		System.out.println("Substraction: " + difference);
		System.out.println("Multiplication: " + product);

		if (num2 != 0) {
			quetient = num1 / num2;
			System.out.println("Division: " + quetient);
		} else {
			System.out.println("Division: Cannot divide by zero");
		}
		sc.close();

	}

}
