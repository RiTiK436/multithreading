package com.jspiders.multithreading.threads;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		
//		for(int i=0;i<5;i++) {
//		System.out.println("MyThread2 is Running");
//	}
		System.out.println("Name of thread :" +Thread.currentThread().getName());
		System.out.println("Priority of thread :" +Thread.currentThread().getPriority());
	}
}
