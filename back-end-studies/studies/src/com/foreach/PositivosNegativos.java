package com.foreach;

import java.util.Scanner;

public class PositivosNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[10];
		
		System.out.println("Digite 10 números: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
		}
		
		System.out.println("Os negativos digitados foram: ");
		for (double verif : numeros) {
			if (verif < 0) {
			System.out.println(verif);
			}
		}
		
		sc.close();
	}

}
