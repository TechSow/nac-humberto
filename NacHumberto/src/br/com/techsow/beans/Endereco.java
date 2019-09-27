package br.com.techsow.beans;

public class Endereco {

	private String tipoLogr, bairro, logradouro, cep, cidade, uf;
	private int id, numero;
	private Pessoa pessoa;
	public String getTipoLogr() {
		return tipoLogr;
	}
	public void setTipoLogr(String tipoLogr) {
		this.tipoLogr = tipoLogr;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public Endereco() {}


	public Endereco( int id, String tipoLogr, String bairro, String logradouro, String cep, String cidade, String uf,
			int numero, Pessoa pessoa) {
		super();
		this.tipoLogr = tipoLogr;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.id = id;
		this.numero = numero;
		this.pessoa = pessoa;
	}

	public Endereco(String tipoLogr, String bairro, String logradouro, String cep, String cidade, String uf,
			int numero) {
		super();
		this.tipoLogr = tipoLogr;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
	} 






}
