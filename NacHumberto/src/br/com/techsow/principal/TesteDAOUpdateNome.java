package br.com.techsow.principal;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.dao.UsuarioDAO;

public class TesteDAOUpdateNome {

	public static void main(String[] args) {
		PessoaDAO dao=null;
		Pessoa p=new Pessoa();
		
		try {

			dao= new PessoaDAO();
			
			p=new PessoaDAO().getPessoa(1);
			

			if(dao.updateNome(p, "Doido")>=1) {
				System.out.println("Nome alterado com sucesso");
			}else {
				System.out.println("Nome não alterado");
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
