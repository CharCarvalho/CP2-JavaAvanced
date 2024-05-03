package com.mattel.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_brinquedos")
public class Brinquedos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column
	private String Nome;
	@Column
	private String Tipo;
	@Column
	private String Classificacao;
	@Column
	private String Tamanho;
	@Column
	private BigDecimal Preco;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getClassificacao() {
		return Classificacao;
	}
	public void setClassificacao(String classificacao) {
		Classificacao = classificacao;
	}
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}
	public BigDecimal getPreco() {
		return Preco;
	}
	public void setPreco(BigDecimal preco) {
		Preco = preco;
	}
	
}
