package com.login.exemplo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Product {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idProduto;
	private String nomeProduto;
	private double precoProduto;
	private int quantidadeProduto;
	
	// Getters and Setters
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Product [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto
				+ ", quantidadeProduto=" + quantidadeProduto + "]";
	}
	
	
	
}
