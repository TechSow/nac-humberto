package br.com.techsow.principal;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.PessoaBO;

public class TesteBOAddPessoa {

	public static void main(String[] args) {

		Usuario teste = new Usuario();
		teste.setId(13);
		teste.setEmail("ff@gmail.com");
		teste.setSenha("12345678");
		
		Pessoa p=new Pessoa();
		p.setId(13);
		p.setIdade(33);
		p.setNome("Italo");
		p.setSobrenome("Chagas");
		p.setUsuarioId(teste);
		
		System.out.println(new PessoaBO().addPessoa(p));
	}
}
