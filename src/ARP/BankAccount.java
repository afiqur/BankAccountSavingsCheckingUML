package ARP;

public abstract class BankAccount {
	private String owner;
	protected double balance;

	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public void deposit() {
		System.out.println("Owners Name: " + owner + "\nOwners Balance: " + balance + "$");
	}

	abstract void withdrawal();
}
