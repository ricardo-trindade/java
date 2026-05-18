package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Verificar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		System.out.println("Bem-vindo!");
		while (true) {
			System.out.println("\nO que deseja fazer? \n1. Adicionar nome = a \n2. Verificar se tal nome está na lista = v \n3. Ver lista completa = l");
		String opcoes = sc.nextLine();
		
		switch (opcoes) {
		
		case "a":
			System.out.print("Digite o nome: ");
			nomes.add(sc.nextLine());
			System.out.println("Nome adicionado");
			break;
			
		case "v":
			System.out.println("Digite o nome: ");
		    String verificador = sc.nextLine();
		    
		    if (nomes.contains(verificador)) { 
		        System.out.println(verificador + " está na lista");
		    } else {
		        System.out.println("Este nome não está na lista");
		    }
		    
		    break;
		    
		case "l":
			for (int i = 0; i < nomes.size(); i++) {
				System.out.println(i + " = " + nomes.get(i));
			}
			break;
		
		default:
			System.err.println("Erro: opção inválida");
		}
		
		}
	}
}
