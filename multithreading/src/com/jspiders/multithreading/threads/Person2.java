package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Account;

public class Person2 extends Thread{
	
	Account account;

	public Person2(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		account.depositeAmount(7000);
		account.withdrawAmount(4000);
	}

}
