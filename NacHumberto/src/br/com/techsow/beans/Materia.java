package br.com.techsow.beans;

public class Materia {

	int id, id_curso;
	String nome, descricao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Materia(int id, int id_curso, String nome, String descricao) {
		super();
		this.id = id;
		this.id_curso = id_curso;
		this.nome = nome;
		this.descricao = descricao;
	}

}
