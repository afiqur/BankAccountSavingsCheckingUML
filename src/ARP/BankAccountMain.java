package ARP;

public class BankAccountMain {
	CheckingAccount checkingAccount;
	SavingsAccount savingsAccount;

	public BankAccountMain(CheckingAccount checkingAccount, SavingsAccount savingsAccount) {
		this.checkingAccount = checkingAccount;
		this.savingsAccount = savingsAccount;
	}

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("SRK", 1000000.00, 0.0);
		SavingsAccount savingsAccount = new SavingsAccount("SRK", 5000000.00, 10.5);
		BankAccountMain bAccountMain = new BankAccountMain(checkingAccount, savingsAccount);
		
		bAccountMain.checkingAccount.diposit();
		bAccountMain.checkingAccount.processCheck();
		bAccountMain.checkingAccount.withdrawal();
		
		bAccountMain.savingsAccount.diposit();
		bAccountMain.savingsAccount.dipositeMonthlyInterest();
		bAccountMain.savingsAccount.withdrawal();
		
	}
}
