package com.characters;

public class Personagem {

	//Attributes
	
	private String nome;
	private String classe;
	private int nivel;
	private int vida;
	
	public Personagem() {
	}

	//Methods
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
		if (nivel < 1) {
			System.out.println("O nível só pode ser entre 0 e 100");
			System.exit(1);
		}
	}

	public int getVida() {
		return vida;
		
	}

	public void setVida(int vida) {
		this.vida = vida;
		if (vida < 0 || vida > 100) {
			System.out.println("A vida só pode ser entre 0 e 100");
			System.exit(1);
		}
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Classe: " + classe + ", Nível: " + nivel + ", Vida: " + vida;
	}
	
	
	
}

