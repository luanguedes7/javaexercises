package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountName = sc.nextLine();
		System.out.print("Is there any initial deposit?");
		String isThereDeposit = sc.nextLine();
		
		Account account = new Account(accountNumber, accountName);
		
		if (isThereDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			account.addDeposit(initialValue);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.addDeposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		account.removeDeposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		sc.close();
	}

}
