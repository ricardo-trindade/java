package com.arrays;

public class MultiplicarPor2 {

	public static void main(String[] args) {
		
		int[] vetor = {1, 3, 5, 7, 9};
		
		System.out.println("Números: ");
		for (int i : vetor) {
		System.out.println(i);
		}

		System.out.println("Multiplicados por 2: ");
		for (int i : vetor) {
			System.out.println(i * 2);
		}
		
	}

}
