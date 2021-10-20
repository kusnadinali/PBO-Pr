package com.praktek;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Agus","Suami","Laki-Laki",38);
		Person p2 = new Person("Ahmad","Suami","Laki-Laki",41);
		Person p3 = new Person("jhon","Suami","Laki-Laki",35);
		
		Person p4 = new Person("Siti","Istri","Perempuan",25);
		Person p5 = new Person("Sumirnah","Istri","Perempuan",40);
		Person p6 = new Person("Angel","Istri","Perempuan",30);
		
		Person p7 = new Person("Windi","Anak","Perempuan",12);
		Person p8 = new Person("Budi","Anak","Laki-Laki",15);
		Person p9 = new Person("Icha","Anak","Perempuan",10);
		Person p10 = new Person("Bagas","Anak","Laki-Laki",20);
		
		List<Person> keluarga1 = new ArrayList<Person>();
		keluarga1.add(p1);
		keluarga1.add(p4);
		keluarga1.add(p9);
		
		List<Person> keluarga2 = new ArrayList<Person>();
		keluarga2.add(p2);
		keluarga2.add(p5);
		keluarga2.add(p7);
		
		List<Person> keluarga3 = new ArrayList<Person>();
		keluarga3.add(p3);
		keluarga3.add(p6);
		keluarga3.add(p10);
		keluarga3.add(p8);
		
		Family f1 = new Family("Agus",keluarga1);
		Family f2 = new Family("Ahmad",keluarga2);
		Family f3 = new Family("Jhon",keluarga3);
		
		List<Family> f4 = new ArrayList<Family>();
		f4.add(f1);
		f4.add(f2);
		f4.add(f3);
		
		RukunTetangga rt = new RukunTetangga(1,"Agus",f4);
		
		RukunWarga rw = new RukunWarga(12,"Wawan");
		
		System.out.printf("====================RW-%02d====================\n",rw.getRw());
		System.out.println("Ketua : "+rw.getKetuaRw());
		Tampil.tampilRt(rt);
		
		
	}
}
