package br.pratico.JavaReactq.a.entities;

import java.io.Serializable;

public class Resposta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private StringBuffer nome;

	public Resposta() {

	}

	public Resposta(Long id, StringBuffer nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StringBuffer getNome() {
		return nome;
	}

	public void setNome(StringBuffer nome) {
		this.nome = nome;
	}

}
