package br.com.techsow.principal;

import br.com.techsow.dao.UsuarioDAO;

public class TesteKillUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDAO dao = null;
		try {
			dao = new UsuarioDAO();
			int row = dao.killUser(50);
			if( !(row == 0)) {
				System.out.println("Deletou");
			}else {
				System.out.println("Não deletou");
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
