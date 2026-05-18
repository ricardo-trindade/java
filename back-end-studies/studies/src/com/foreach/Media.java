package com.foreach;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[5];
		
		System.out.println("Digite as 5 notas: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (double num : notas) {
			soma += num;
		}

		System.out.println("A média final é: " + soma / 5);
		
		sc.close();
	}

}
