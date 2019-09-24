package br.com.techsow.beans;

public class Pessoa {

	private int id, idade;
	private String nome, sobrenome;
	private Usuario usuarioId = new Usuario();
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Usuario getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Usuario usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	
	public Pessoa() {
	}
	
	public Pessoa(int id, int idade, String nome, String sobrenome, Usuario usuarioId) {
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.usuarioId = usuarioId;
	}
	
	public Pessoa(int id, int idade, String nome, String sobrenome) {
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.usuarioId = usuarioId;
	}
	
	public Pessoa(int idade, String nome, String sobrenome) {
		this.idade = idade;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
		
	
}
