package entities;

public class Account {

	private int accountNumber;
	private String accountName;
	private double balance;
	
	public Account() {
	}

	public Account(int accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
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
	
	public void addDeposit(double deposit) {
		balance += deposit;
	}
	
	public void removeDeposit(double deposit) {
		balance -= deposit;
	}
	
	public String toString() {
		return "Account " +
				accountNumber +
				", Holder: " +
				accountName +
				", Balance: $" +
				balance;
	}			
	
}
