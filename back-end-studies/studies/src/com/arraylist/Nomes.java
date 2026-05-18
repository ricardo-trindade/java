package com.arraylist;

import java.util.ArrayList;

public class Nomes {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Mateus");
		nomes.add("Douglas");
		nomes.add("Davi");
		nomes.add("Natanael");
		nomes.add("Eduardo");
		
		for (int i = 0; i < 2; i++) {
			System.out.println(nomes.get(i));
		}
	}

}
