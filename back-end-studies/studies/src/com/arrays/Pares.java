package com.arrays;

import java.util.Random;

public class Pares {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] vetor = new int[10];
		
		System.out.println("Números: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(100) + 1;
			System.out.println(vetor[i]);
		}
		
		System.out.println("Os pares são: ");
		for (int num : vetor) {
			if (num % 2 == 0) {
			System.out.println(num);
			}
		}

		
		
		
	}

}
