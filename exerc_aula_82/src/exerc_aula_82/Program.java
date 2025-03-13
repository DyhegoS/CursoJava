package exerc_aula_82;

import java.util.Locale;
import java.util.Scanner;
import util.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account Name: ");
		String accountName = sc.next();
		System.out.print("Is there  an initial deposit? ");
		char isDeposit = sc.next().charAt(0);
		
		Account account = new Account(accountNumber, accountName, isDeposit);
		if(account.getIsDeposit() == 'Y') {
			System.out.print("Enter Initial deposit value: ");
			double balance = sc.nextDouble();
			account.setBalance(balance);
		}
		System.out.println();
		System.out.println("Account Data: " + account);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double balance = sc.nextDouble();
		account.Deposit(balance);
		System.out.println();
		System.out.println("Update account data: " + account);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		account.Withdraw(balance);
		System.out.println();
		System.out.println("Update account data: " + account);


		
		sc.close();
		
	}

}
