package br.edu.facthus.poo.model;

import java.math.BigDecimal;

public class Produto {
	
	private Integer id;
	
	private String descricao;
	
	private BigDecimal preco;
	
	private Integer quantidade;
	
	public Produto(String descricao, BigDecimal preco, Integer quantidade) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
