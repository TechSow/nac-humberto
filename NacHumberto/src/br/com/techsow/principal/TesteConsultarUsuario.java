package br.com.techsow.principal;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class TesteConsultarUsuario {

	public static void main(String[] args) {
		UsuarioDAO dao = null;
		try {
			dao = new UsuarioDAO();
			Usuario user = dao.getUser(1);
			System.out.println(user.getEmail());
			System.out.println(user.getSenha());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
