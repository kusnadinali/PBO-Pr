package com.praktek;

import java.util.Scanner;

public class operasi_textfield {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			System.out.println("nilai a adalah = " + a);
		}catch(Exception e) {
			System.out.println("error pada = "+e);
		}
	}
}
