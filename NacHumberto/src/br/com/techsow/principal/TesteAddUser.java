package br.com.techsow.principal;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class TesteAddUser {

	public static void main(String[] args) {
		Connection con=null;
		try {
			UsuarioDAO dao=new UsuarioDAO();
			
			Usuario u=new Usuario();
//			u.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id")));
//			u.setNome(JOptionPane.showInputDialog("Digite o nome do usuario"));
//			u.setEmail(JOptionPane.showInputDialog("Digite o email do usuario"));
//			u.setSenha(JOptionPane.showInputDialog("Digite a senha do usuario"));
			
			u.setId(1);
			u.setNome("bia");
			u.setEmail("bia.me");
			u.setSenha("itsla");
		if(dao.addUser(u)>1) {
			System.out.println("Adicionado com sucesso");
		}else {
			System.out.println("Nao adicionado");
		}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
