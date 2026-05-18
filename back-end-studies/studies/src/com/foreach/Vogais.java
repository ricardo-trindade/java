package com.foreach;

import java.util.Scanner;

public class Vogais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] letras = new char[10];

		System.out.println("Digite 10 letras: ");
		for (int i = 0; i < letras.length; i++) {
			letras[i] = sc.next().toLowerCase().charAt(0);
		}
		
		System.out.println("As vogais digitadas foram: ");
		for (char verif : letras) {
			if (verif == 'a' || verif == 'e' || verif == 'i' || verif == 'o' || verif == 'u') {
				System.out.println(verif);
			}
		
			}
			
			sc.close();
		
		}
	}


