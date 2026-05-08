package Exercícios;

import java.util.Scanner;

public class ExercicioD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tempo gasto:" );
	    double tempo = sc.nextDouble();
	    
	    System.out.print("Digite a velocidade média:" );
	    double velocidade = sc.nextDouble();

	    double distancia = tempo * velocidade;
	    double litros = distancia / 2;
	    
	    System.out.println("Velocidade média: " + velocidade);
	    System.out.println("Tempo gasto: " + tempo);
	    System.out.println("Distância " + distancia);
	    System.out.println("Litros usados: " + litros);
	    
	    sc.close();
	    
	}

}
