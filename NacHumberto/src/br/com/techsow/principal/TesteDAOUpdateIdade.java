package br.com.techsow.principal;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.dao.UsuarioDAO;

public class TesteDAOUpdateIdade {

	public static void main(String[] args) {

		PessoaDAO dao=null;
		Pessoa p=new Pessoa();
		
		try {

			dao= new PessoaDAO();
			
			p=new PessoaDAO().getPessoa(1);
			

			if(dao.updateIdade(p, 1)>=1) {
				System.out.println("Idade alterada com sucesso");
			}else {
				System.out.println("Idade não alterada");
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
