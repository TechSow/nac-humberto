package br.com.techsow.principal;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.dao.PessoaDAO;

public class TesteDAOUpdateSobrenome {

	public static void main(String[] args) {
		PessoaDAO dao=null;
		Pessoa p=new Pessoa();

		try {

			dao= new PessoaDAO();

			p=new PessoaDAO().getPessoa(1);


			if(dao.updateSobreNome(p, "Doido")>=1) {
				System.out.println("Sobrenome alterado com sucesso");
			}else {
				System.out.println("Sobrenome não alterado");
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
