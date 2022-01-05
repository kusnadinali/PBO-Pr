package com.praktek;

import java.util.*;

public class Threadthing implements Runnable {
	private int numberOfCashier;
	
	public Threadthing(int x) {
		numberOfCashier  = x;
	}
	
	public int randomInteger() {
		Random rand = new Random();
		int Upperbound = 50;
		int int_random = rand.nextInt(Upperbound);
		return int_random;
		
	}
	
	@Override
	public void run() {
		for(int i=0;i <=randomInteger();i++) {
			System.out.println("<<<>kasir "+ numberOfCashier + "menangani ==>>"+i );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}
