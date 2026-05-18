package com.arrays;

import java.util.Scanner;

public class Frutas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] frutas = {"Banana", "Manga", "Pera", "Uva"};

		System.out.println("Digite uma fruta: ");
		String Fruta = sc.next();
		
		boolean encontrada = false;
		
		for (String verificador : frutas) {
			if (Fruta.equalsIgnoreCase(verificador)) {
			   encontrada = true;
			   break;
			}
		}
		
		if (encontrada) {
			System.out.println("Essa fruta está na lista");
		} else {
			System.out.println("Essa fruta não está na lista");
		}
		
		sc.close();
	}

}
