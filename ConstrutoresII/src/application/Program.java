package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter Account Number");
		int number = sc.nextInt();
		System.out.println("Enter Account Holder :");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is There an initial Deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter Initial Deposit Value :");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account Data ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a Deposit Value :");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update Account Data :");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a WithDraw Value :");
		double withDrawValue = sc.nextDouble();
		account.withdraw(withDrawValue);
		System.out.println("Update Account Data :");
		System.out.println(account);
		

		sc.close();
	}

}
