package Loop;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua nota: ");
		while (true) {
		double nota = sc.nextDouble();
		
		
		if (nota >= 7 && nota <= 10) {
		 System.out.println("Aprovado!");
		 break;
		} else if (nota >= 4 && nota <= 7) {
		 System.out.println("Você está de recuperação. ");
		 break;
		} else if (nota >= 0 && nota < 4) {
		 System.out.println("Você está reprovado!");
		 break;
		} else if (nota < 0) {
		 System.err.println("Erro: nota negativa. Tente novamente: ");
		} else if (nota > 10) {
		System.err.println("Erro: nota maior que a nota máxima. Tente novamente: ");
		}
		
		}

	}

}
