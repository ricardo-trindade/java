package Exercícios;

import java.util.Scanner;

public class ExercicioE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da prestação: " );
	    double valor = sc.nextDouble();
		
	    System.out.print("Digite o valor da taxa: " );
	    double taxa = sc.nextDouble();
	    

	    System.out.print("Digite o valor do tempo: " );
	    double tempo = sc.nextDouble();
	    
	    double prestacao = valor + (valor * (taxa / 100) * tempo);
	    
	    System.out.printf("O valor da prestação é de %.2f",prestacao);
	    
	    sc.close();
		
		
		
		
	}

}
