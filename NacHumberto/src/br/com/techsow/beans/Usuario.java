package br.com.techsow.beans;

public class Usuario {
	
	private int id;
	private String email,senha;
	boolean isAdm, isProfessor;
	
	
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
	public boolean getIsAdm() {
		return isAdm;
	}
	public void setAdm(boolean isAdm) {
		this.isAdm = isAdm;
	}
	
	public boolean getIsProfessor() {
		return isProfessor;
	}
	public void setProfessor(boolean isProfessor) {
		this.isProfessor = isProfessor;
	}
	
	
	public Usuario(int id, String email, String senha, boolean isAdm, boolean isProfessor) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.isAdm = isAdm;
		this.isProfessor = isProfessor;
	}
	
	
	public Usuario(int id, String email, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	
	
	public Usuario() {
		
	}
	
	
}
