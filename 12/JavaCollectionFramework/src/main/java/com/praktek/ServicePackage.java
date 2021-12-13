package com.praktek;

public class ServicePackage {
	private String service;
	private long value;
	
	public ServicePackage(String service, long value) {
		this.service = service;
		this.value = value;
	}
	
	public String getService() 
	{
		return service;
	}
	
	public void setService(String service) 
	{
		this.service = service;
	}
	public long getValue() 
	{
		return value;
	}
	public void setValue(int value) 
	{
		this.value = value;
	}
	
}
