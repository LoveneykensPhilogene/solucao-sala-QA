package br.pratico.JavaReactq.a.entities;

import java.io.Serializable;

public class Administrador implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String sobreNome;
	private String email;
	private String telefone;

	public Administrador() {

	}

	public Administrador(Long id, String nome, String sobreNome, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		this.telefone = telefone;
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

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
