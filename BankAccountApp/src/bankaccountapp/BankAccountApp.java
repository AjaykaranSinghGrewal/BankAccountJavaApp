package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "NewBankAccounts.csv";
		List<Account> accounts = new LinkedList<Account>();
		
		//read a csv file and create new accounts based on that data
		List<String[]> newAccountHolders = CSVUtility.read(file);
		
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, SSN, initDeposit));
			} else {
				System.out.println("ERROR Reading Account Type");
			}
		}
		
		for(Account acc: accounts) {
			System.out.println("\n***********");
			acc.showInfo();
		}
		
	}

}
