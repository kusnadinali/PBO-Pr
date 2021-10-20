package com.praktek;

import java.util.*;

public class RukunTetangga {
	private int rt;
	private String ketuaRt;
	private List<Family> family;
	
	public RukunTetangga(int rt,String ketuaRt,List<Family> family) {
		this.rt = rt;
		this.ketuaRt = ketuaRt;
		this.family = family;
	}
	
	public int getRt() {
		return rt;
	}
	public void setRt(int rt) {
		this.rt = rt;
	}
	public List<Family> getFamily() {
		return family;
	}
	public void setFamily(List<Family> family) {
		this.family = family;
	}

	public String getKetuaRt() {
		return ketuaRt;
	}

	public void setKetuaRt(String ketuaRt) {
		this.ketuaRt = ketuaRt;
	}
}
