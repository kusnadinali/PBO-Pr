package com.praktek;

import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;

public abstract class SuperHero implements Comparable<SuperHero>{
	protected int powerLevel;
	protected String name;
	protected List<Power> powerList;
	
	public SuperHero(int powerLevel,String name) 
	{
		this.powerLevel = powerLevel;
		this.name = name;
		this.powerList = new ArrayList<Power>();
	}

	public int getPowerLevel() 
	{
		return powerLevel;
	}

	public String getName() 
	{
		return name;
	}
	
	public void addPower(Power power)
	{
		powerList.add(power);
	}
	
	public abstract void identity();
	
	public void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
		for (Power temp : powerList) {
			temp.doPower();
		}
	};
	
	@Override
	public int compareTo(SuperHero o){
		if(this.powerLevel > o.powerLevel) {
			return 1;
		}else if(this.powerLevel < o.powerLevel) {
			return -1;
		}
		return 0;
	}
}
