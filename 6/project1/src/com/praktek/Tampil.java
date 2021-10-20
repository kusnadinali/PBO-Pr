package com.praktek;

import java.util.*;

public class Tampil {
	public static void tampilPerson(Person person) {
		System.out.println("================================================");
		System.out.println("Nama          : "+person.getNama());
		System.out.println("Jenis kelamin : "+person.getJeniskelamin());
		System.out.println("Role          : "+person.getRole());
		System.out.println("Umur          : "+person.getUmur());
		System.out.println("================================================");
	}
	
	public static void tampilFamily(Family family) {
		List<Person> persontemp = family.getPerson();
		System.out.println("=====================Family=====================");
		System.out.println("Nama : keluarga "+family.getNameFamily());
		System.out.println("====================Anggota=====================");
		for(Person p:persontemp) {
			tampilPerson(p);
		}
	}
	public static void tampilRt(RukunTetangga rt) {
		Scanner in = new Scanner(System.in);
		System.out.printf("======================RT-%02d======================\n",rt.getRt());
		System.out.println("Ketua : "+rt.getKetuaRt());
		System.out.printf("tampilkan keluarga? (1/0)");
		
		if(in.nextInt()==1) {
			List<Family> familytemp = rt.getFamily();
			for(Family f:familytemp) {
				tampilFamily(f);
			}
		}else {
		System.out.println("===================================================");
		}
		in.close();
	}
}
