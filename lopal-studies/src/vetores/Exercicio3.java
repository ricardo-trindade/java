package array.list;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
      
		Random rd = new Random();
		
		int vetor[] = new int[8];
		
		for (int i = 0; i < vetor.length; i++) {
	    vetor[i] = rd.nextInt(100);
			
		}
		
		System.out.println("Números: ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		
		}
      	System.out.println();
		
		
		int maior = vetor[0];
		int menor = vetor[0];
	
		for (int i = 1; i < vetor.length; i++) {
			
		    if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
			
			
		}
		
		System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
	
	
	
	
	
	}
			
}

