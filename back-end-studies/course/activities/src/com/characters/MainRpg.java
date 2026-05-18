package com.characters;

import java.util.Scanner;

public class MainRpg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Personagem ps1 = new Personagem();
		
        System.out.print("Digite o nome do seu personagem: ");
		ps1.setNome(sc.nextLine());
		
		System.out.print("Digite a classe: ");
		ps1.setClasse(sc.nextLine());
		
		System.out.print("Digite o nível: ");
		ps1.setNivel(sc.nextInt());
		
		System.out.print("Digite a vida: ");
		ps1.setVida(sc.nextInt());
		
		System.out.println("Informações do perosnagem:\n"+ps1);
		
	    sc.close();
	}

}
