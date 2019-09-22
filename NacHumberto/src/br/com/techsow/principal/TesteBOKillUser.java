package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.bo.UsuarioBO;

public class TesteBOKillUser {

	public static void main(String[] args)
	{

		try {
			System.out.println(new UsuarioBO().deleteUser(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	

}
