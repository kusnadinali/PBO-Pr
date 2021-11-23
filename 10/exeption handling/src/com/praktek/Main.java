package com.praktek;

public class Main {
	public static void main( String[] args ) {
		
		try {
			Thread t = new Thread(new AsyncRun());
//			System.out.println("hai");
			t.start();
			System.out.println( "main on thread " + Thread.currentThread().getId());
			throw new NullPointerException();
		}
		catch(Exception ex){
			System.out.println(ex + " handled 1");
		}
//		System.out.println("hai ali");
	}
}

