package com.praktek;

public class operasi_array {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		try {
			for(int i = 0;i<=5;i++) {
				System.out.println("nilai dari index "+i+" = "+arr[i]);
			}
		}catch(Exception e) {
			System.out.println("WARNING!!!");
			System.out.println("jumlah index tidak boleh lebih dari "+ arr.length);
		}
	}
}
