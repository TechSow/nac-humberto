package br.com.techsow.bo;

import br.com.techsow.beans.Materia;
import br.com.techsow.dao.CursoDAO;
import br.com.techsow.dao.MateriaDAO;

public class MateriaBO {



	public String addMateria(Materia materia) {

		if(materia.getEmenta().length() > 100) {
			return "Tamanho da descricao excedeu o limite de caracteres";
		}

		if(materia.getNome().length() > 100) {
			return "Nome da matéria maior do que o esperado";
		}

		if(materia.getId_curso().getId() == 0) {
			return "ID do curso nao encontrado. Curso não existe";
		}

		
		CursoDAO cursoDao = null;
		try {
			
			cursoDao = new CursoDAO();
			if(cursoDao.getCursoId(materia.getId_curso().getId()) == 1) {
				return "O curso informado ja contem essa máteria";
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		

		/////////////////////////////////////////
		//Espaco para os requisitos funcioinais//
		/////////////////////////////////////////


		MateriaDAO materiaDao = null;
		int retorno = 0;

		try {
			materiaDao = new MateriaDAO();
			retorno = materiaDao.addMateria(materia)	;


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				materiaDao.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		if(retorno == 1) {
			return "Materia criada com sucesso";
		}else {
			return "Materia não pode ser cadastrado. Verificar dados informados";
		}

	}		

}
