package com.login.exemplo.dto;

public class ProdutoResponseDTO {
	
	private String nomeProduto;
	private double precoProduto;
	private int quantidadeProduto;
	
	public ProdutoResponseDTO() {
	}

	public ProdutoResponseDTO(String nomeProduto, double precoProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	
	
	
}
