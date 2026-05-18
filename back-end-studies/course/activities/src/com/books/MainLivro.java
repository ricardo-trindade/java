package com.books;

import java.util.Scanner;

public class MainLivro {

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
		Livro l1 = new Livro();
		
		System.out.print("Coloque o título do livro: ");
		l1.setTitulo(sc.nextLine());

		System.out.print("Coloque o autor: ");
		l1.setAutor(sc.nextLine());
		
		System.out.print("Coloque o número de páginas: ");
		int paginas = sc.nextInt();
		l1.setPaginas(paginas);
		
		System.out.println(l1.toString());
	
	    sc.close();
	}

}
