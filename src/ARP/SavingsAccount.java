package ARP;

public class SavingsAccount extends BankAccount {
	private double annualInterestRate;

	public SavingsAccount(String owner, double balance, double annualInterestRate) {
		super(owner, balance);
		this.annualInterestRate = annualInterestRate;
	}

	public void depositeMonthlyInterest() {
		System.out.println("Monthly Interest Rate: " + annualInterestRate + "%");
	}

	public void withdrawal() {
		System.out.println("Withdrawal Ammount: " + balance + "$");
	}
}

