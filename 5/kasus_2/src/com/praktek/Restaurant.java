package com.praktek;

public class Restaurant {
//	private String[] nama_makanan;
//	private double[] harga_makanan;
//	private int[] stok;
	private Makanan menu_makanan;
	private static byte idMakanan=0;
	
	public Restaurant() {
//		this.nama_makanan = new String[10];
//		this.harga_makanan = new double[10];
//		this.stok = new int[10];
		menu_makanan = new Makanan();
	}
	public void tambahMenuMakanan(String nama, double harga, int stok) {
//		this.nama_makanan[idMakanan] = nama;
//		this.harga_makanan[idMakanan] = harga;
//		this.stok[idMakanan] = stok;
		menu_makanan.setNama_makanan(nama, idMakanan);
		menu_makanan.setHarga_makanan(harga, idMakanan);
		menu_makanan.setStok(stok, idMakanan);
	}
	public void tampilMenuMakanan(){
		for(byte i =0; i<=idMakanan;i++){//mengganti tipe data i menjadi byte dari int
			if(!isOutOfStock(i)){
				//System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
				System.out.println(menu_makanan.getNama_makanan(i) +"["+menu_makanan.getStok(i)+"]"+"\tRp. "+menu_makanan.getHarga_makanan(i));
			}
		}
	}
	
	public boolean isOutOfStock(byte id){
		if(menu_makanan.getStok(id) == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void nextId(){
		idMakanan++;
	}
	
	public void pesanMenuMakanan(String nama,byte jumlah) {
		byte idTemp = menu_makanan.cariIdMakanan(nama);
		if(menu_makanan.getStok(idTemp)>=jumlah) {
			menu_makanan.setStok(-jumlah, idTemp);
		}else {
			if(menu_makanan.getStok(idTemp)>0) {
				System.out.println("maaf stok "+menu_makanan.getNama_makanan(idTemp)+" tidak ada sesuai dengan jumlah");
			}else {
				System.out.println("maaf stok "+menu_makanan.getNama_makanan(idTemp)+" sedang kosong");
			}
		}
	}
}
