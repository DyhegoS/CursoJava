package util;

public class Account {
	private int accountNumber;
	private String accountName;
	private double balance;
	private char isDeposit;
	
	
	public Account(int accountNumber, String accountName, char isDeposit) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.isDeposit = isDeposit;
	}
	
	public Account(double balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public char getIsDeposit() {
		return isDeposit;
	}

	public void setIsDeposit(char isDeposit) {
		this.isDeposit = isDeposit;
	}

	public void Deposit(double balance) {
		this.balance += balance;
	}
	
	public void Withdraw(double balance) {
		double tax = balance + 5.00;
		this.balance -= tax;
	}
		
	public String toString() {
		return "Account: " + getAccountNumber() + ", Holder: " + getAccountName() + ", Balance: $" + String.format("%.2f", getBalance());
	}
}

