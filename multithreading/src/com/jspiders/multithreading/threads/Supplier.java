package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Shop;

public class Supplier extends Thread{

	Shop shop;

	public Supplier(Shop shop) {
		super();
		this.shop = shop;
	}
	
	@Override
	public void run() {
		shop.restockProduct(20);
	}
}
