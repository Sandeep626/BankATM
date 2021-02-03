package com.company;

public class Customer {
	
	public static void main(String[] args) {
		
		BankService myBankService = new BankService();
		int mySaving = myBankService.createNewAccount(500.00);
		int myInvestment = myBankService.createNewAccount(1000.00);
		myBankService.deposit(mySaving, 250.00);
		myBankService.withdraw(myInvestment, 100.00);
		myBankService.transferMoney(mySaving, myInvestment, 300.00);
		
	}
	
}
