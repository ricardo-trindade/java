package array.list;

import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int vetor[] = new int[15];
		
		for (int i = 0; i < vetor.length; i++) {
		vetor[i] = rd.nextInt(100);
		}
		
		System.out.println("Números: ");
		
		for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i] + " ");
		}
		
		System.out.println();
		
		int pares = 0;
		System.out.println("Pares: ");
		for (int i = 0; i < vetor.length; i++) {
			
		if (vetor[i] % 2 == 0) {
		pares++;
		}
	}
	
		System.out.println("Quantidade de pares: " + pares);
		
	
	
	
 }
	
}
