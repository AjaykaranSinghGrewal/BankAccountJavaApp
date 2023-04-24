package bankaccountapp;

public class Checking extends Account{
	//list properties specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 12));
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		//rate variable was defined in parent Account class but we define it in child classes with different implementation
		rate = getBaseRate() * .15;
	}
	
	//list any methods specific to checking account
	public void showInfo() {
		System.out.println("\nACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println("Debit Card Number: "+debitCardNumber);
		System.out.println("Debit Card PIN: " +debitCardPIN);
	}

}
