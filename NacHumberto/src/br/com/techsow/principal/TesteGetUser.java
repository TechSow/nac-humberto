


package br.com.techsow.principal;

import javax.swing.JOptionPane;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class TesteGetUser {

	public static void main(String[] args) {
		UsuarioDAO dao=null;
		try {
			dao=new UsuarioDAO();

			Usuario u= dao.getUser(23);

			if(u.getIsAdm()) {
				System.out.println(u.getIsAdm());
			}else {
				System.out.println(u.getId());
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