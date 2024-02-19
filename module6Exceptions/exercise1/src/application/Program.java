package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account acc1 = new Account(number, holder, balance, withdrawLimit);

			System.out.print("Enter amout for withdraw: ");
			double amount = sc.nextDouble();
			acc1.withdraw(amount);

			System.out.print("New balance: " + String.format("%.2f", acc1.getBalance()));

		} catch (DomainExceptions e) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		}

		sc.close();
	}

}
