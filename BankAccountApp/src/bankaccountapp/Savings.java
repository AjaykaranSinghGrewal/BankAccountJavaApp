package bankaccountapp;

public class Savings extends Account{
	//list properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor to initialize savings account properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
		
	//list any methods specific to savings account
	public void showInfo() {
		System.out.println("\nACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println("Safety Deposit Box ID: " +safetyDepositBoxID);
		System.out.println("Safety Deposit Box Key: " +safetyDepositBoxKey);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		//rate variable was defined in parent Account class but we define it in child classes with different implementation
		rate = getBaseRate() - 0.25;
		
	}

}
