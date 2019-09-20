package br.com.techsow.beans;

public class Usuario {
	
	private int id;
	private String nome,email,senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario(int id, String nome, String email, String senha) {
		this(email,senha);
		this.id = id;
		this.nome = nome;
		}
	public Usuario() {
		
	}
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
}
