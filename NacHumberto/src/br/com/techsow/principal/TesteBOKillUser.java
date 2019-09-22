package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.UsuarioBO;

public class TesteBOKillUser {

	public static void main(String[] args)
	{

		Usuario teste = new Usuario();
		teste.setId(198);
		teste.setNome("ElGrandePanda");
		teste.setEmail("panda@gmail.com");
		teste.setSenha("12345678");
		try {
			System.out.println(new UsuarioBO().deleteUser(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	

}
