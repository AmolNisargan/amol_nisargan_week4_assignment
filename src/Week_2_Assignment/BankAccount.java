package Week_2_Assignment;

import java.util.Scanner;

/*Implement a BankAccount class with methods
for deposit, withdrawal, and displaying the
account balance.
2.*/
public class BankAccount {

	private double balance;

	public void deposite(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println(amount + " is Deposited Successfully");
		}else {
			System.out.println("Invalid Amount");
		}
	}

	public void withdrowal(double amount) {
		if (balance >= amount && amount>0) {
			balance -= amount;
			System.out.println(amount + " is Withdrowal Successfully");
		} else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
	}

	public void displayBalance() {
		System.out.println("Your Current Balance : " + balance);
	}

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		Scanner sc = new Scanner(System.in);
		int a = 1;
		while (a != 0) {
			System.out.println("Enter your Choise:");
			System.out.println(1 + ": Diposite");
			System.out.println(2 + ": Withdrowal");
			System.out.println(3 + ": Balance Check");
			System.out.println(0 + ": Exit");
			int choise = sc.nextInt();
			switch (choise) {
			case 1: {
				System.out.println("Enter Amount to Diposite");
				double amount = sc.nextDouble();
				obj.deposite(amount);
				obj.displayBalance();
				break;
			}
			case 2: {
				System.out.println("Enter Amount to be withdrowal");
				double amount = sc.nextDouble();
				obj.withdrowal(amount);
				obj.displayBalance();
				break;
			}
			case 3: {
				obj.displayBalance();
				break;
			}
			case 0: {
				a = 0;
				System.out.println("Thank Good Bye...!");
				break;

			}
			default: {
				System.out.println("Invalide Choise..!");
				break;
			}
			}

		}
	}
}
