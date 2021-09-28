package br.pratico.JavaReactq.a.entities;

import java.io.Serializable;

public class Sala implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private StringBuffer descricao;

	public Sala() {

	}

	public Sala(Long id, String nome, StringBuffer descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StringBuffer getDescricao() {
		return descricao;
	}

	public void setDescricao(StringBuffer descricao) {
		this.descricao = descricao;
	}

}
