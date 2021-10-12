package com.praktek;

public class Makanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	
	public Makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int[10];
	}
	public String getNama_makanan(byte id) {
		return this.nama_makanan[id];
	}
	public void setNama_makanan(String nama_makanan,byte id) {
		this.nama_makanan[id] = nama_makanan;
	}
	public double getHarga_makanan(byte id) {
		return harga_makanan[id];
	}
	public void setHarga_makanan(double harga_makanan,byte id) {
		this.harga_makanan[id] = harga_makanan;
	}
	public int getStok(byte id) {
		return stok[id];
	}
	public void setStok(int stok,byte id) {
		this.stok[id] += stok;
	}
	
	public byte cariIdMakanan(String nama) {
		for(byte i = 0;i<this.nama_makanan.length;i++) {
			if(nama.compareTo(this.nama_makanan[i])==0) {
				return i;
			}
		}
		return -1;
	}
	
}
