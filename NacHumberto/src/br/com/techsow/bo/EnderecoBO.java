package br.com.techsow.bo;

import br.com.techsow.beans.Endereco;
import br.com.techsow.beans.Pessoa;
import br.com.techsow.dao.EnderecoDAO;
import br.com.techsow.dao.PessoaDAO;
import br.com.techsow.util.Util;

public class EnderecoBO {

	//Necessário validar os métodos abaixo
	public String addEndereco(Endereco endereco) {
		
		if(endereco.getTipoLogr().matches(".*\\d.*")) {
			return "O tipo de logradouro não pode conter números";
		}
		
		if(endereco.getBairro().matches(".*\\d.*")) {
			return "Bairro não pode conter números";
		}
		
		if(endereco.getCep().length()>8) {
			return "CEP maior que o esperado";
		}
		
		if(endereco.getCidade().matches(".*\\d.*")) {
			return "Cidade não pode conter número";
		}
		
		if(endereco.getCidade().length() >30) {
			return "Campo cidade maior que o esperado";
		}
		
		if(endereco.getLogradouro().length() > 50) {
			return "Campo Logradouro maior que o esperado";
		}
		
		if(!Util.stringContainsNumber(Integer.toString(endereco.getNumero()))) {
			return "Campo número não pode conter Letras";
		}
		
		PessoaDAO dao = null;
		Pessoa idPessoa;
		try {
			idPessoa = dao.getPessoa(endereco.getPessoa().getId());
			//Precisa confirmar essa validacao
			if(idPessoa.getId() == 0){
				return "Pessoa não encontrada com o ID informado no endereco";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(endereco.getUf().length() > 2) {
			return "UF só pode conter 2 caracteres";
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
			return "Endereco não pode ser cadastrado. Verificar dados informados";
		}
		
	}		
	
	
}
