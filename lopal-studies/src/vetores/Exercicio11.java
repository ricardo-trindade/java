package exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] vetor = new int[5];
		for (int i = 0; i < vetor.length; i++) {
		vetor[i] = rd.nextInt(101);
		}

		Arrays.sort(vetor);
		System.out.println("Ordem original: ");
		for (int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i] + " ");
		} System.out.println();
		System.out.println("Nova ordem: ");
		int último = vetor[vetor.length - 1];
	    for (int i = vetor.length - 1; i > 0; i--) {
	    vetor[i] = vetor[i - 1];
		} vetor[0] = último;
	    for (int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i] + " ");
		}       
	}
}
