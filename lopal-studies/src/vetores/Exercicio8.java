package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		
		for (int i = 0; i < vetor1.length; i++) {
		vetor1[i] = rd.nextInt(100);
		} for (int i = 0; i < vetor2.length; i++) {
		vetor2[i] = rd.nextInt(100);
		}
		
		Arrays.sort(vetor1);
		Arrays.sort(vetor2);
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetor1.length; i++) {
		System.out.print(vetor1[i] + " ");
		} 
		System.out.println();
		System.out.print("Vetor B: ");
		for (int i = 0; i < vetor2.length; i++) {
		System.out.print(vetor2[i] + " ");
		}
			
		// Comparando os números de mesmas posições:
		
		for (int i = 0; i < vetor2.length; i++) {
			if (vetor1[i] == vetor2[i]) {
			System.out.println("Posição " + (i + 1) + ": " + vetor1[i]);
			}
		}
		
		
		
	}

}
