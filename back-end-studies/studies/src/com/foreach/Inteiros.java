package com.foreach;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inteiros = new int[10];

		System.out.println("Digite 10 números: ");
		for (int i = 0; i < inteiros.length; i++) {
			inteiros[i] = sc.nextInt();
		}
		
		int contador = 0;
		
		for (int i : inteiros) {
			if (i > 50) {
				contador++;
			}
		}
		
		System.out.print("Quantidade de números maiores que 50: " + contador);
		
		sc.close();
	}

}
