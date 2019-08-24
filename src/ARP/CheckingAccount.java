package ARP;

public class CheckingAccount extends BankAccount {

	private double insufficientFundsFee;

	public CheckingAccount(String owner, double balance, Double insufficientFundsFee) {
		super(owner, balance);
		this.insufficientFundsFee = insufficientFundsFee;
	}

	public void processCheck() {
		System.out.println("Remaining Funds: " + insufficientFundsFee);
	}

	public void withdrawal() {
		System.out.println("Withdrawal Ammount: " + balance + "$");
	}

}

