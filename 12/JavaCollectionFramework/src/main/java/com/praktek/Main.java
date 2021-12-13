package com.praktek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Gson gson = new Gson();
		ArrayList<Pesanan> data = gson.fromJson(new FileReader(
				"E:\\KULIAH\\Semester 3\\PBO Pr\\PBO-Pr\\12\\barang.json"), 
					new TypeToken<ArrayList<Pesanan>>() {}.getType()
					);
		int loop = 1;
		for (Iterator<Pesanan> iterator = data.iterator(); iterator.hasNext();) {
			Pesanan temp = iterator.next();
			System.out.println("barang ke " + loop + " = " +temp.toString());
			loop++;
		}
	}

}
