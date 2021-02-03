package com.company;

import java.util.HashMap;
import java.util.Map;

public class BankService {

	AtmAds ad = new AtmAds();
	AtmUserLog log = new AtmUserLog();
	AtmStatus status = new AtmStatus();
	Map<Integer, NewBankAccount> ac = new HashMap<>();
	NewBankAccount acc;

	public BankService() {

	}

	public int createNewAccount(double x) {
		acc = new NewBankAccount(x);
		ac.put(acc.accountNumber, acc);
		System.out.println("New Account Created \n Account number: " + acc.accountNumber + "\t - Account Balance: "
				+ acc.balance() + "\n");
		return acc.accountNumber;
	}

	public void transferMoney(int x, int y, double z) {
		System.out.println("Before Transfer: \nAccount No: " + ac.get(y).accountNumber + "\t" + "AccountBalance: "
				+ ac.get(y).accountBalance);
		System.out.println(
				"Account No: " + ac.get(x).accountNumber + "\t" + "AccountBalance: " + ac.get(x).accountBalance + "\n");
		ac.get(y).subtract(z);
		ac.get(x).add(z);
		System.out.println("After Transfer: \nAccount No: " + ac.get(y).accountNumber + "\t" + "AccountBalance: "
				+ ac.get(y).accountBalance);
		System.out.println(
				"Account No: " + ac.get(x).accountNumber + "\t" + "AccountBalance: " + ac.get(x).accountBalance);

	}

	public double withdraw(int x, double z) {
		System.out.println("Withdraw " + z + " from Account " + ac.get(x).accountNumber);
		ad.showAds();
		ac.get(x).subtract(z);
		log.SaveUserLog();
		status.SaveAtmStatus();
		System.out.println("Account Balance after withdrawal: " + ac.get(x).balance() + "\n");
		return ac.get(x).balance();
	}

	public double deposit(int x, double y) {
		System.out.println("Deposit " + y + " in Account " + ac.get(x).accountNumber);
		ad.showAds();
		ac.get(x).add(y);
		log.SaveUserLog();
		status.SaveAtmStatus();
		System.out.println("Account Balance after deposit: " + ac.get(x).balance() + "\n");
		return ac.get(x).balance();
	}

}
