package br.com.techsow.bo;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.dao.UsuarioDAO;

public class PessoaBO {

//Necess�rio validar os m�todos abaixo! 
	
	public String addPessoa(Pessoa pessoa) {

		if(pessoa.getNome().length() < 3) {
			return "O nome n�o pode ter menos que 3 caracteres";
		}

		if(pessoa.getIdade() <=0) {
			return "Idade inv�lida.";
		}

		if(pessoa.getNome().length()>20) {
			return "Excedeu a quantidade de caracteres";
		}
		if(pessoa.getSobrenome().length()>30) {
			return "Excedeu a quantidade de caracteres";
		}
		if(pessoa.getIdade()>120) {
			return "Idade nao existente";
		}
		
		
		PessoaDAO dao = null;
		Pessoa verificarId = null;
		try {

			dao = new PessoaDAO();
			verificarId = dao.getPessoa(pessoa.getId());

		} catch (Exception e) {
			e.printStackTrace();
		}

		if(verificarId.getId() > 0) {
			return "Ocorreu um erro ao criar seu cadastro. Envie um Email a TechSow para obter suporte.�";
		}


		int ret = 0;

		try {

			ret = dao.addPessoa(pessoa);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dao.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(ret == 0) {
			return "Houve um erro, por favor, tente mais tarde";
		}else {
			return "Cadastro efetuado com sucesso";
		}
		
	}	
	
	//////////////////////////////////////////////////////
	
	
	public String deleteUser(int id) throws Exception{

		PessoaDAO dao = null;
		int retorno =0;
		try {
			dao = new PessoaDAO();	
			try {
				retorno = dao.killPessoa(id);
			}catch(Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dao.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		if (retorno == 1) {
			return "Pessoa deletada com sucesso";
		}else {
			return "Pessoa n�o pode ser deletado. Verificar as informa��es fornecidas";			
		}

	}
	
	
}	

