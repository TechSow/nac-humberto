package br.com.techsow.principal;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class TesteAddUser {

	public static void main(String[] args) {
		UsuarioDAO dao=null;
		try {
			dao=new UsuarioDAO();
			
			Usuario u=new Usuario();
			u.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id")));
			u.setEmail(JOptionPane.showInputDialog("Digite o email do usuario"));
			u.setSenha(JOptionPane.showInputDialog("Digite a senha do usuario"));
			u.setAdm(Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true ou false")));
			u.setProfessor(Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true ou false")));


			
		if(dao.addUser(u)>=1) {
			System.out.println("Adicionado com sucesso");
		}else {
			System.out.println("Nao adicionado");
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
