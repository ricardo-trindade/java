package com.login.exemplo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductRequestDTO {

	@Size(min = 1, max = 255, message = "Product name must be between 1 and 255 characters long")
	private String nomeProduto;
	
	@NotBlank(message = "Product must have price")
	private double precoProduto;
	
	@NotNull(message = "Product amount can't be 0")
	private int quantidadeProduto;

	public ProductRequestDTO() {
	}

	public ProductRequestDTO(String nomeProduto, double precoProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	
	
}
