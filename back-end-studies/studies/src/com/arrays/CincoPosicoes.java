package com.arrays;

import java.util.Scanner;

public class CincoPosicoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		System.out.println("Digite 5 números: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}

		System.out.println("Os 5 números são: ");
		for (int num : vetor) {
		System.out.println(num);
		}
	
		sc.close();
		
	}

}
