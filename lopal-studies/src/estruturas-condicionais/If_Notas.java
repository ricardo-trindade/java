package LOPAL;

import java.util.Scanner;

public class If_Notas {

	public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual foi a nota do aluno? " );
		double nota = sc.nextDouble();
		
		if (nota >= 0 & nota < 7) {
	    System.out.print("Reprovado!");
		} else if (nota >= 7 & nota <= 10) {
	    System.out.print("Aprovado!");
		} else if (nota < 0) {
		System.err.print("Erro: nota inválida; número negativo detectado. ");
	    } else if (nota > 10) {
	    System.err.print("Erro: nota impossível; número maior que 10 detectado. ");
	   
	    sc.close();
	    }

	}

}
