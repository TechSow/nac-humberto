package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class TesteUpdateSenha {

	public static void main(String[] args) {
		UsuarioDAO dao=null;
		Usuario u=new Usuario();
		try {
			dao= new UsuarioDAO();
			u.setId(1);
			u.setEmail("email");
			u.setSenha("senha");
			dao.updateSenha(u, "senha123");
			
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
