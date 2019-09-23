package br.com.techsow.bo;

import br.com.techsow.beans.Pessoa;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.dao.UsuarioDAO;

public class PessoaBO {

//Necessário validar os métodos abaixo! 
	
	public String addPessoa(Pessoa pessoa) {

		if(pessoa.getNome().length() < 3) {
			return "O nome não pode ter menos que 3 caracteres";
		}

		if(pessoa.getSobrenome().length() < 5) {
			return "O Sobrenome não pode ter menos que 5 caracteres";
		}

		if(pessoa.getIdade() <=0) {
			return "Idade inválida.";
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
			return "Ocorreu um erro ao criar seu cadastro. Envie um Email a TechSow para obter suporte.ç";
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
			return "Pessoa não pode ser deletado. Verificar as informações fornecidas";			
		}

	}
	
			//req funcional da pessoa
	
	public String novaPessoa(Pessoa p)throws Exception{
		if(p.getNome().length()>20) {
			return "Excedeu a quantidade de caracteres";
		}
		if(p.getSobrenome().length()>30) {
			return "Excedeu a quantidade de caracteres";
		}
		if(p.getIdade()>120) {
			return "Idade nao existente";
		}
		return null;
	}
	
	
	
	
	
	
}	

