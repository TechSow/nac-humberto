package br.com.techsow.bo;

import br.com.techsow.beans.Endereco;
import br.com.techsow.beans.Pessoa;
import br.com.techsow.dao.EnderecoDAO;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.util.Util;

public class EnderecoBO {

	//Necess�rio validar os m�todos abaixo
	public String addEndereco(Endereco endereco) {
		
		if(endereco.getTipoLogr().matches(".*\\d.*")) {
			return "O tipo de logradouro n�o pode conter n�meros";
		}
		
		if(endereco.getBairro().matches(".*\\d.*")) {
			return "Bairro n�o pode conter n�meros";
		}
		
		if(endereco.getCep().length()>8) {
			return "CEP maior que o esperado";
		}
		
		if(endereco.getCidade().matches(".*\\d.*")) {
			return "Cidade n�o pode conter n�mero";
		}
		
		if(endereco.getCidade().length() >30) {
			return "Campo cidade maior que o esperado";
		}
		
		if(endereco.getLogradouro().length() > 50) {
			return "Campo Logradouro maior que o esperado";
		}
		
		if(!Util.stringContainsNumber(Integer.toString(endereco.getNumero()))) {
			return "Campo n�mero n�o pode conter Letras";
		}
		
		PessoaDAO dao = null;
		Pessoa idPessoa;
		try {
			idPessoa = dao.getPessoa(endereco.getPessoa().getId());
			//Precisa confirmar essa validacao
			if(idPessoa.getId() == 0){
				return "Pessoa n�o encontrada com o ID informado no endereco";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(endereco.getUf().length() > 2) {
			return "UF s� pode conter 2 caracteres";
		}
		
		
		/////////////////////////////////////////
		//Espaco para os requisitos funcioinais//
		/////////////////////////////////////////

		
		
		EnderecoDAO enderecoDao = null;
		int retorno = 0;
			
		try {
		retorno = enderecoDao.addEndereco(endereco)	;
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				enderecoDao.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		if(retorno == 1) {
			return "Endereco salvo com sucesso";
		}else {
			return "Endereco n�o pode ser cadastrado. Verificar dados informados";
		}
		
	}		
	
	
}
