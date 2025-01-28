package anything;

enum AccountType {
	SAVINGS,
	CURRENT,
	FIXED_DEPOSIT,
}

public class BankAccount {
	private String accountNumber;
	private double balance;
	private AccountType accountType;
	
	public BankAccount(String accountNumber, double balance, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.printf("New balance: %.2f\n", balance);
		} else {
			System.out.println("Deposit amount must be greater than zero");
		}
	}
	
	public static void main(String args[]) {
		BankAccount acc = new BankAccount("12345", 5000.0, AccountType.SAVINGS);
		acc.deposit(1000.0);
	}
}
