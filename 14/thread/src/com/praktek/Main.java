package com.praktek;

public class Main {
	  public static void main(String[] args) {
		  for(int i = 0; i<5;i++) {
			  Threadthing t = new Threadthing(i+1);
			  Thread myThread = new Thread(t);
			  myThread.start();
		  }
	  }
}