package br.pratico.JavaReactq.a.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private StringBuffer pergunta;

	public Questao() {

	}

	public Questao(Long id, StringBuffer pergunta) {
		this.id = id;
		this.pergunta = pergunta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StringBuffer getPergunta() {
		return pergunta;
	}

	public void setPergunta(StringBuffer pergunta) {
		this.pergunta = pergunta;
	}

}
