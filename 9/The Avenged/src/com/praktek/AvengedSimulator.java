package com.praktek;

import java.util.*;
//import java.lang.*;

public class AvengedSimulator {
	public static void addSuperHero(List<SuperHero> s,String name,int level,String hero) {
		SuperHero temp = null;
		switch(hero) {
			case "FlyingDutchMan":
				temp = new FlyingDutchMan(level, name);
				break;
			case "ManRay":
				temp = new ManRay(level, name);
				break;
			case "DirtyBubble":
				temp = new DirtyBubble(level, name);
				break;
		}
		s.add(temp);
	}
	public static void sortLevelAsc(List<SuperHero> s) {
		//shorting ascending
		for(int i=0;i<s.size();i++) {
			for (int j=i+1;j<s.size();j++) {
				 if(s.get(i).powerLevel > s.get(j).powerLevel) {
					 SuperHero temp = s.get(i);
					 s.set(i, s.get(j));
					 s.set(j,temp);
				 }
			 }
		}
	}
	
	public static void main(String[] args) {
		 List<SuperHero> superhero = new ArrayList<SuperHero>();
		 addSuperHero(superhero, "Gennichiro", 0, "ManRay");
		 addSuperHero(superhero, "Shirai", 255, "FlyingDutchMan");
		 addSuperHero(superhero, "Gyoubu Masataka Oniwa", 553, "ManRay");
		 addSuperHero(superhero, "Tatenari", 36556, "FlyingDutchMan");
		 addSuperHero(superhero, "Arnastria", 666, "DirtyBubble");
		 
		 //sorting
//		 sortLevelAsc(superhero);
		 //sorting dengan comparable
		 Collections.sort(superhero);
		 
		 for (SuperHero dede : superhero) {
			 System.out.println("===============================");
			 dede.identity();
			 dede.showPowers();
			 System.out.println("===============================");
		 }
//		 superhero.get(1).identity();
	}
}
