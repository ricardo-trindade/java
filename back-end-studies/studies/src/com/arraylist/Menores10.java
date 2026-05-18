package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Menores10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Bem-vindo!");
		while (true) {
			System.out.println("O que deseja fazer? \n1. Adicionar número = a \n2. Remover todos números menores que 10 = r \n3. Ver lista completa = v");
			String opcao = sc.nextLine();
			
			switch (opcao) {
			case "a":
				System.out.print("Digite o número: ");
				numeros.add(sc.nextInt());
				sc.nextLine();
				System.out.println("Número adicionado");
				break;
				
			case "r":
                numeros.removeIf(n -> n < 10);
                System.out.println("Números menores que 10 removidos");
                break;
				
			case "v":
				for (int i = 0; i < numeros.size(); i++) {
					System.out.println(i + ": " + numeros.get(i));
				}
				break;
				
			default:
				System.err.println("Erro: opção inexistente");
			}

		}

	}

}
