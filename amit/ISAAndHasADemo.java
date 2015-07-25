// BRD
class Account {
	int accountNo;
	String accountHolderName;
	void deposit(){
		
	}
	void withDraw(){
		
	}
}
// IS-A RelationShip
class SavingAccount extends Account
{
	void payROI(){
		
	}
}
class Customer {
	void applyForAccount(){
		// HAS-A RelationShip
		SavingAccount account = new SavingAccount();
		account.deposit();
		account.withDraw();
		account.payROI();
	}
}
public class ISAAndHasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
