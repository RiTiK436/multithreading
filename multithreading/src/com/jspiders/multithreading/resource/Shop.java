package com.jspiders.multithreading.resource;

public class Shop {
	int availableProducts;

	public Shop(int availableProducts) {
		this.availableProducts = availableProducts;
	}
	
	public synchronized void orderProducts(int noOfProducts) {
		System.out.println("Trying to Purchase "+noOfProducts+" Products");
		if(noOfProducts>availableProducts) {
			System.out.println(noOfProducts+" Products not availabe");
			System.out.println("Please Wait..!!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableProducts -=noOfProducts;
		System.out.println(noOfProducts+" Products Purchased");
		System.out.println("Now Avaliable Products :"+availableProducts);
	}
	public synchronized void restockProduct(int noOfProducts) {
		System.out.println("Restocking "+noOfProducts+" Products");
		availableProducts += noOfProducts;
		System.out.println("Now Avaliable Products :"+availableProducts);
		this.notify();
	}
}
