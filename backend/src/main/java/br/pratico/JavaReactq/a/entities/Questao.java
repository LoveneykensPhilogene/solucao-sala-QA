package br.pratico.JavaReactq.a.entities;

import java.io.Serializable;

public class Questao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
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
