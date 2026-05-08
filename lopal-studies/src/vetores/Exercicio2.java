package vetores.matrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int vetor[] = new int[10];
		
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
	    vetor[i] = rd.nextInt(1, 101);
	    System.out.println(vetor[i]+" ");
	    soma += vetor[i];
	    
		}
		
		System.out.println("\nSoma dos números: " + soma);
        sc.close();
	}

}
