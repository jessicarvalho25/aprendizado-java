package principal;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Integer accountNumber;
		System.out.printf("Enter account number: ");
		accountNumber = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.printf("Is there na initial deposit? ");
		String answer = sc.nextLine();

		Account account; 

		
		
		
		if (answer.equals("y")) {
			System.out.printf("Enter initial deposit value: ");

			Double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, initialDeposit, accountHolder);
		}
		
		else {
			account = new Account(accountNumber, accountHolder);
		}

		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.printf("Enter a deposit value: ");
		Double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.printf("Enter a withdraw value: ");
		Double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account);


		sc.close();

	}

}
