package exercicios;

import java.util.Scanner;

public class ValidadorDeSenhas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c;
        System.out.println("Crie sua senha! Requisitos:\nPelo menos uma letra maiúscula\nPelo menos um número primo\nPelo menos um caractere especial\nNão pode conter vogais duplicadas seguidas");
		String senha = sc.nextLine();
        
        boolean temMaiuscula = false;
        boolean temPrimo = false;
        boolean temEspecial = false;
        boolean temVogDupSeg = false;
        
        String vogais = "aeiouAEIOU";
        String especiais = "!@#$%¨&*(){}[]?/°;:|ºª=+-_.,<>§¹²³£¢¬´`~^";
        
        for (int i = 0; i < senha.length(); i++) {
		c = senha.charAt(i);
		
	    if (Character.isUpperCase(c)) {
		temMaiuscula = true;
	    }
		 
        if (Character.isDigit(c)) {
        int num = Character.getNumericValue(c);
        if (isPrimo(num)) {
        temPrimo = true;
         }
        }
        
        if (especiais.indexOf(c) != -1) {
        temEspecial = true;
        }
        	
        if (i < senha.length() -1) {
        char prox = senha.charAt(i + 1);
        if (vogais.indexOf(c) != - 1 && c == prox) {
        temVogDupSeg = true;
        }
        }
        	
        if (!temMaiuscula) {
            System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
        }
        if (!temPrimo) {
            System.out.println("A senha deve conter pelo menos um número primo (2, 3, 5, 7, etc.).");
        }
        if (!temEspecial) {
            System.out.println("A senha deve conter pelo menos um caractere especial (!@#$%&*).");
        }
        if (temVogDupSeg) {
            System.out.println("A senha não pode conter vogais duplicadas seguidas.");
        }

        if (temMaiuscula && temPrimo && temEspecial && !temVogDupSeg) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida. Corrija os erros acima.");
        }

        sc.close();
       }	
   	
	}	
      
        public static boolean isPrimo(int num) {
        if (num <= 1) {
        return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
        if (num % i == 0) {
        return false; 
         }
        }
        return true; 
        	
  }  
}
        
	


