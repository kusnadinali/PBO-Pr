package com.praktek;

import java.util.Scanner;

public class Main {
	public static int parseHexInt(String hex) {
	    try {
	        return Integer.parseInt(hex, 16);
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
	public static String inputHex() {
		String hex=null;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("===========================================");
				System.out.print("masukan bilangan hex : ");
				hex = sc.next();
				System.out.print("apakah jumlah digit Hex adalah : "+ hex.length() + "(1/0)");
				if(sc.nextInt()==1) {
					System.out.println("===========================================");
					break;
				}else {
					System.out.println("betulkan lagi format angka!");
				}
				System.out.println("===========================================");
			}
		}
		
		return hex;
	}
	
	public static void main(String[] args) {
		String hex = inputHex();
		int cek = parseHexInt(hex);
		System.out.println( "hasilnya adalah = " +cek);
	}
}
