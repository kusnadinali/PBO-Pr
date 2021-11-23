package com.praktek;

import java.io.FileInputStream;

public class operasi_file {
	public static void main(String[] args) {
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream("input.txt");
		}catch(Exception e) {
			System.out.println("file ini tidak dapat ditemukan");
		}
	}
}
