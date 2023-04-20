package com.jspiders.multithreading.main;

public class SleepDemo {

	public static void main(String[] args) {
		String msg = "This Is The Execution Of Sleep()";
		for(int i =0;i<msg.length();i++)
		{
			System.out.print(msg.charAt(i));
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
