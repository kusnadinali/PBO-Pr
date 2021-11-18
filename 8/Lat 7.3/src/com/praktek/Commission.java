package com.praktek;

public class Commission extends Hourly{
	private double totalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		// TODO Auto-generated constructor stub
		this.commissionRate = commissionRate;
	}
	public void addSales(double totalSales) {
		this.totalSales = totalSales;
	}
	public double pay()
	{
		double payment = super.pay() + super.pay()*this.commissionRate;
		return payment;
	}
	public String toString()
	{
	  String result = super.toString();

	  result += "\naing Total Sales: " + totalSales;

	  return result;
	}
}
