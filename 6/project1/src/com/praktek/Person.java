package com.praktek;

public class Person {
	private String nama;
	private String role;
	private String jeniskelamin;
	private int umur;
	
	public Person(String nama,String role, String jeniskelamin,int umur) {
		this.nama = nama;
		this.role = role;
		this.jeniskelamin = jeniskelamin;
		this.umur = umur;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getJeniskelamin() {
		return jeniskelamin;
	}
	public void setJeniskelamin(String jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
}
