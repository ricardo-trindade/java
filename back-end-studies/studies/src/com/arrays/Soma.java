package com.arrays;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[6];
		
		System.out.println("Digite 6 números: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}

		int soma = 0;
		
		for (int num : vetor) {
			soma += num;
		}
		
		System.out.println("Soma dos números: " + soma);
		
		sc.close();
		
	}
	
}
