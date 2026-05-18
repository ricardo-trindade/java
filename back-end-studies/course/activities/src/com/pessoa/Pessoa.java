package com.pessoa;

public class Pessoa {

	//Attributes
	
	private String nome;
	private int idade;
	
	public Pessoa() {
	}
	
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
			System.out.println("Idade definida: " + idade);
			System.out.println("Nome definido: " + nome);
		} else {
			System.err.println("Idade inválida");
		}
	
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + ", idade: " + idade;
	}
	

	


	

	
	
	
		
		
	}
	
	
	

