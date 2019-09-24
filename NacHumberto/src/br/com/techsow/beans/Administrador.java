package br.com.techsow.beans;

public class Administrador extends Usuario{

	private String nome, sobrenome, cpf;
	private Endereco enderecoId;
	
	public Administrador(int id, String email, String senha, String nome, String sobrenome, String cpf,
			Endereco enderecoId) {
		super(id, email, senha);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.enderecoId = enderecoId;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEnderecoId() {
		return enderecoId;
	}
	public void setEnderecoId(Endereco enderecoId) {
		this.enderecoId = enderecoId;
	}
	
	
}
