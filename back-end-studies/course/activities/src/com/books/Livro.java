package com.books;

public class Livro {

	//Attributes
	
	private String titulo;
	private String autor;
	private int paginas;
	
	//Objects
	
	public Livro() {
	}

	//Methods
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
		for (int i = 0; i < titulo.length(); i++) {
			if (titulo.charAt(i) == '.') {
				System.err.println("O titulo do livro não pode conter ponto final ");
			}
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
		for (int i = 0; i < autor.length(); i++) {
			if (autor.charAt(i) == '.') {
				System.err.println("O titulo do livro não pode conter ponto final ");
			} else {
			 break;
			}
		}
		
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
		if (paginas < 5) {
		System.err.println("O número de páginas não pode ser menor que 5");
		}
		
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Autor: " + autor + ", Número de páginas: " + paginas;
	}

	
	
	
	
	
	
	
	
	
	
}
