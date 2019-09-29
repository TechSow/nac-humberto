package br.com.techsow.principal;

import br.com.techsow.beans.Curso;
import br.com.techsow.bo.CursoBO;

public class TesteBOaddCurso {

	public static void main(String[] args) {

		Curso curso= new Curso();

		curso.setDescricao("teste");
		curso.setId(2);
		curso.setNome("TDS");
		curso.setDuracao(2);
		
		String bo = new CursoBO().addCurso(curso);
		
		System.out.println(bo);
	}

}
