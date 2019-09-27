package br.com.techsow.principal;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.PessoaBO;

public class TesteBOAddPessoa {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setEmail("1berto@gmail.com");
		usuario.setSenha("12345");
		
		Pessoa p=new Pessoa();
		p.setId(2);
		p.setNome("Humberto");
		p.setSobrenome("Fiapero");
		p.setUsuarioId(usuario);
		
		System.out.println(new PessoaBO().addPessoa(p));
	}
}
