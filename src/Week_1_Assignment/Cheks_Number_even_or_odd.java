package Week_1_Assignment;

import java.util.Scanner;

/*Create a program that takes user input and checks if the number is even or odd.*/
public class Cheks_Number_even_or_odd {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
		sc.close();
	}
}
