package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitarNomes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();

		while (true) {
			
			System.out.println("Escolha a opção: \n 1. Criar nome = cn \n 2. Ver nomes = vn \n 3. Sair = s");
			String escolha = sc.nextLine();
			
			switch (escolha) {
			
			case "cn":
		     	System.out.print("Digite o nome: ");
			    nomes.add(sc.nextLine());
			    break;
			    
			case "vn":
			    for (String i : nomes) {
			    	System.out.println(i);
			    }
				
				break;
				
			case "s":
				System.out.println("Adeus!");
				sc.close();
			    return;
			    
			default:
				System.err.println("Erro: escolha inválida");
			}
		}
	}
}