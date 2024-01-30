package HW1;

public class BankAccount {
	public int AccountNumber;
	public int Balance;
	
	
public BankAccount(int AccountNumber, int Balance) {
	this.AccountNumber = AccountNumber;
	this.Balance = Balance;
}



public static void main(String[] args) {
	BankAccount MyAccount = new BankAccount(128803, 1000);
	System.out.println("My account number " + MyAccount.AccountNumber + " and I have " + MyAccount.Balance + " dollars");
	
	

	}

}
// Maggie Dunn HW 17