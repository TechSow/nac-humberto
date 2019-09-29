package br.com.techsow.principal;

import br.com.techsow.beans.Curso;
import br.com.techsow.dao.CursoDAO;

public class TesteDAOAddCurso {

	public static void main(String[] args) {

		

		CursoDAO dao = null;
		Curso curso= new Curso();

		try {
			dao = new CursoDAO();

			curso.setDescricao("teste");
			curso.setId(2);
			curso.setNome("TDS");
			curso.setDuracao(2);


			if(dao.addCurso(curso) == 1){

				System.out.println("curso criado com sucesso");
			}else {
				System.out.println("Nao adicionado");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dao.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}