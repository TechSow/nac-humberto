package br.com.techsow.beans;

public class Usuario {
	
	private int id;
	private String email,senha;
	boolean isAdm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isAdm() {
		return isAdm;
	}
	public void setAdm(boolean isAdm) {
		this.isAdm = isAdm;
	}
	public Usuario(int id, String email, String senha, boolean isAdm) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.isAdm = isAdm;
	}
	
	
	
}
