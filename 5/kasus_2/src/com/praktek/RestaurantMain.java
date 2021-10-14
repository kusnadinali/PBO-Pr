package com.praktek;

public class RestaurantMain {
	static void inisialisasiMakanan(Restaurant menu) {
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
//		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
//		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
//		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
	}
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		inisialisasiMakanan(menu);
		
		menu.tampilMenuMakanan();
		System.out.println();
		menu.pesanMenuMakanan("Bala-Bala",(byte) 10);
		menu.pesanMenuMakanan("Tahu",(byte) 10);
		
		menu.tampilMenuMakanan();
		
	}
}
