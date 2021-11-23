package com.praktek;

public class operasi_pembagian {
	public static void main(String[] args) {
		try {
		System.out.println("hasil pembagian = "+45/0);
		}catch(Exception e) {
			System.out.println("hasil tidak dapat diketahui");
		}
	}
}
