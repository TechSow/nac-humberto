package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.UsuarioBO;

public class TesteBOAddUser {

	public static void main(String[] args) {
		Usuario teste = new Usuario();
		teste.setId(23);
		teste.setEmail("dasda@gmail.com");
		teste.setSenha("12345678");
		teste.setAdm(false);
		teste.setProfessor(false);

		String bo = new UsuarioBO().addUser(teste);
		
		System.out.println(bo);
		
	}
	
}
