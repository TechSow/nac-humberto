package br.com.techsow.principal;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.dao.UsuarioDAO;

public class TesteAddPessoa {

	public static void main(String[] args) {

		PessoaDAO dao=null;
		try {
			dao=new PessoaDAO();

			/*
			 * Pessoa p=new Pessoa();
			 * p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id")));
			 * p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade")));
			 * p.setNome((JOptionPane.showInputDialog("Digite o Nome do usuario")));
			 * p.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome do usuario"));
			 * p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Uusario"
			 * )));
			 * 
			 */
			
			Usuario usuario = new UsuarioDAO().getUser(12);
			
			Pessoa p=new Pessoa();
			p.setId(12);
			p.setIdade(33);
			p.setNome("Italo");
			p.setSobrenome("Chagas");
			p.setUsuarioId(usuario);
			

			if(dao.addPessoa(p)>=1) {
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