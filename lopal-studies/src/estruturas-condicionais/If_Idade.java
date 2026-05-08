package LOPAL;

import java.util.Scanner;

public class If_Idade {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Qual a sua idade:");
		  int idade = sc.nextInt();
		  
		  if (idade >= 0 && idade < 18) {
		  System.out.print("Você é menor de idade");
		  } else if (idade > 18 & idade < 60) {
		  System.out.print("Você é adulto");
		  } else if (idade >= 60) {
		  System.out.print("Você é idoso");
		  
		  } else if (idade < 0) {
	      System.err.print("Erro: Idade Inválida");
		  }
		  
		  sc.close();
			

	}

}
