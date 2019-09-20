package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class TesteLoginUser {

	public static void main(String[] args) {
		UsuarioDAO dao=null;
		Usuario u=new Usuario();
		try {
			dao=new UsuarioDAO();
			u.setEmail("email");
			u.setSenha("senha");
			if(dao.loginUser(u)==null) {
				System.out.println("erro");
			}else {
				System.out.println("logado");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dao.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
