package br.com.techsow.principal;

import br.com.techsow.beans.Curso;
import br.com.techsow.beans.Materia;
import br.com.techsow.bo.MateriaBO;

public class TesteBOAddMateria {

	public static void main(String[] args) {
		Materia materia = new Materia();
		Curso curso= new Curso();

		curso.setDescricao("teste");
		curso.setId(2);
		curso.setNome("TDS");
		curso.setDuracao(2);
		
		materia.setEmenta("teste");
		materia.setId(1);
		materia.setId_curso(curso);
		materia.setNome("seila");
		
		String bo = new MateriaBO().addMateria(materia);
		
		System.out.println(bo);
	
	}

}
