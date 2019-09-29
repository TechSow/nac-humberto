package br.com.techsow.bo;

import java.sql.SQLException;

import br.com.techsow.beans.Curso;
import br.com.techsow.dao.CursoDAO;

public class CursoBO {


	public String addCurso(Curso curso) {

		if(curso.getDescricao().length() > 100) {
			return "Campo descricao ultrapassou quantidade de caracteres(100)";
		}


		if(curso.getDuracao() == 0) {
			return "Duracao do curso invalida. Insira um valor valido";
		}

		if(curso.getNome().length() > 100 ) {
			return "Tamanho do nome do curso ultrapassa o tamanho limite";
		}

		

		/////////////////////////////////////////
		//Espaco para os requisitos funcioinais//
		/////////////////////////////////////////

		
		
		
		CursoDAO dao = null;
		int retorno=0;

		try {
			
			dao = new CursoDAO();
			retorno = dao.addCurso(curso);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dao.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		if(retorno == 1) {
			return "Sucesso";
		}else {
			return "Sem sucesso";
		}

	}
}