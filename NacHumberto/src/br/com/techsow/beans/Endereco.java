package br.com.techsow.beans;

public class Endereco {

	private String rua, logradouro, cep, cidade, estado;
	private int numero;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	public Endereco(String rua, String logradouro, String cep, String cidade, String estado, int numero) {
		super();
		this.rua = rua;
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
	}
	
}
