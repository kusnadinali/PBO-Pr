package com.praktek;

import java.util.*;

public class Family {
	private String nameFamily;
	private List <Person> person;
	
	public Family(String nameFamily,List<Person> person) {
		this.nameFamily = nameFamily;
		this.person = person;
	}
	

	public String getNameFamily() {
		return nameFamily;
	}
	public void setNameFamily(String nameFamily) {
		this.nameFamily = nameFamily;
	}
	public List<Person> getPerson() {
		return person;
	}
	
}
