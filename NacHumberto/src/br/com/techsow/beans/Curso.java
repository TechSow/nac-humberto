package br.com.techsow.beans;

import java.util.ArrayList;

import br.com.techsow.lixeira.Aluno;

public class Curso {

	private int id;
	private String nome, descricao;
	private ArrayList <Aluno> alunos = new ArrayList();
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Aluno> getId_aluno() {
		return alunos;
	}
	public void setId_aluno(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void setNewAluno(Aluno a) {
		this.alunos.add(a);
	}
	
	public Curso(int id, String nome, String descricao, ArrayList<Aluno> alunos) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.alunos = alunos;
	}
	
	public Curso(ArrayList<Aluno> alunos) {
		super();
		this.alunos = alunos;
	}	
	
	
	public Curso(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Curso(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
}
