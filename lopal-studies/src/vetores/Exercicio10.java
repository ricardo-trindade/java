package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[6];
		System.out.println("Digite as notas: ");
		
		for (int i = 0; i < notas.length; i++) {
		while (true) {
		notas[i] = sc.nextDouble();
		if (notas[i] > 10 || notas[i] < 0) {
		System.err.println("Erro: nota inválida. Certifique-se de não digitar notas maiores que 10 ou menores que 0. Tente novamente: ");
		} else {
		break;
		}
	    }
        }
	
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
	    soma += notas[i]; 
		}
		
		double média = soma / notas.length;
		System.out.printf("A média das notas é %.2f", média);
			
		}
		
		
		
		
		

  
	
	
	
	
	
	}
 
