package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Remover {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> carros = new ArrayList<>();
		
        System.out.println("Bem-vindo!");
        while (true) {
        	System.out.println("\nO que deseja fazer? \n1. Adicionar carro = add \n2. Excluir carro = ex \n3. Ver carros = ver \n4. Sair = s");
        	String escolha = sc.nextLine();
        	
        	switch (escolha) {
        	
        	 case "add":
        		 System.out.print("\nDigite o nome do carro: ");
        		 carros.add(sc.nextLine());
        		 System.out.println("Carro adicionado!");
        		 break;
        	
        	 case "ver":
        		 for (int i = 0; i < carros.size(); i++) {
 					System.out.println(i + " = " + carros.get(i));
         		 }
        		 break;
        		 
        	 case "ex":
        		 System.out.println("\nQual carro deseja excluir? ");
        		 for (int i = 0; i < carros.size(); i++) {
					System.out.println(i + " = " + carros.get(i));
        		 }
					int posicao = sc.nextInt();
					sc.nextLine();
					carros.remove(posicao);
					System.out.println("Carro removido!");
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
