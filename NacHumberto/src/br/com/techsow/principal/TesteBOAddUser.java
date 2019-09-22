package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.UsuarioBO;

public class TesteBOAddUser {

	public static void main(String[] args) {
		Usuario teste = new Usuario();
		teste.setId(12);
		teste.setEmail("ff@gmail.com");
		teste.setSenha("12345678");
		System.out.println(new UsuarioBO().addUser(teste));
		
	}
	
}
