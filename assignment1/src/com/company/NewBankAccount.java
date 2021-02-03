package com.company;

public class NewBankAccount extends Account implements IBankAccount {

	public NewBankAccount(double x) {
		super(x);
	}

	public void subtract(double i) {
		accountBalance -= i;
	}

	public void add(double i) {
		accountBalance += i;
	}

	public double balance() {

		return accountBalance;
	}

}
