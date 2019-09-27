package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.UsuarioBO;

public class TesteBOAddUser {

	public static void main(String[] args) {
		Usuario teste = new Usuario();
		teste.setId(1);
		teste.setEmail("Humberto@gmail.com");
		teste.setSenha("1234567");
		teste.setAdm(false);
		teste.setProfessor(true);
		
		String bo = new UsuarioBO().addUser(teste);
		
		System.out.println(bo);
		
	}
	
}
