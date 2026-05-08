package array.list;

import java.util.Arrays;
import java.util.Random;

public class Exercicio5e6 {

	public static void main(String[] args) {
		
		Random rd = new Random();
    	int vetor[] = new int[6];
		
		
		for (int i = 0; i < vetor.length; i++) {
		vetor[i] = rd.nextInt(100);
		}
		
		System.out.println("Ordem crescente: ");
		
		Arrays.sort(vetor);
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i] + " ");
		}
			
		
		System.out.println();
		System.out.println();
		System.out.println("Ordem decrescente: ");
		
		Arrays.sort(vetor);
		for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
		}
			
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


