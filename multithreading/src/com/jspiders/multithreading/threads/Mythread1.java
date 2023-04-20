package com.jspiders.multithreading.threads;

public class Mythread1 extends Thread {
	
	@Override
	public void run() {
		
//		for(int i=0;i<5;i++) {
//			System.out.println("MyThread1 is Running ..!!");
//		}
		
		System.out.println("Name of thread :" +this.getName());
		System.out.println("Priority of thread :" +this.getPriority());
	}
}
