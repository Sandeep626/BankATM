package com.company;

public class Account {
	
	public static int numaccount = 0;
	int accountNumber;
	double accountBalance;

	public Account(double initAmount) {
		accountNumber = ++numaccount;
		this.accountBalance = initAmount;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

	public void withdraw(double amount) {
		accountBalance -= amount;
	}

	public double getBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return String.format("Account No: %s \t AccountBalance: %s \n", accountNumber, accountBalance);
	}
}
