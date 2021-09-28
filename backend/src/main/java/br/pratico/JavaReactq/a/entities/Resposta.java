package br.pratico.JavaReactq.a.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resposta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
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
