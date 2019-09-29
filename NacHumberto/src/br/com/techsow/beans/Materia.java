package br.com.techsow.beans;

public class Materia {

	int id;
	Curso id_curso;
	String nome, ementa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Curso getId_curso() {
		return id_curso;
	}
	public void setId_curso(Curso id_curso) {
		this.id_curso = id_curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	
	public Materia() {}
	
	
	public Materia(int id, Curso id_curso, String nome, String ementa) {
		super();
		this.id = id;
		this.id_curso = id_curso;
		this.nome = nome;
		this.ementa = ementa;
	}

}
