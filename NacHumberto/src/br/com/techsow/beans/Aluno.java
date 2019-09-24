package br.com.techsow.beans;

public class Aluno extends Usuario{

	private int id, curso_id;
	private Usuario usuarioId;
	private Pessoa pessoaId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCurso_id() {
		return curso_id;
	}
	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}
	public Usuario getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Usuario usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Pessoa getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(Pessoa pessoaId) {
		this.pessoaId = pessoaId;
	}
	
	public Aluno(int id, String email, String senha, int id2, int curso_id, Usuario usuarioId,
			Pessoa pessoaId) {
		super(id, email, senha);
		id = id2;
		this.curso_id = curso_id;
		this.usuarioId = usuarioId;
		this.pessoaId = pessoaId;
	}
	
	
	public Aluno(int id, String email, String senha, int id2, int curso_id, Usuario usuarioId) {
		super(id, email, senha);
		id = id2;
		this.curso_id = curso_id;
		this.usuarioId = usuarioId;
	}
			
}
