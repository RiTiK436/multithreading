package com.jspiders.multithreading.resource;

public class Account {

	int accountBalance;

	public Account(int accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	
	public void checkBalance() {
		System.out.println("Balance : "+accountBalance);
	}
	
	public synchronized void depositeAmount(int amount) {
		System.out.println("Deposite "+amount+"rs in account");
		accountBalance += amount;
		checkBalance();
	}
	
	public synchronized void withdrawAmount(int amount) {
		System.out.println("Trying to withdraw "+amount+"rs from account");
		
		if(amount>accountBalance) {
			System.out.println("Insufficient Balance");
		}
		else {
			accountBalance -= amount;
			checkBalance();
		}
	}
}
