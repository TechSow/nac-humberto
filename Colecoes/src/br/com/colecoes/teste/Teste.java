package br.com.colecoes.teste;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class Teste {

	public static void main(String[] args) {


		List <Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("ESTAGIARIO", "JR", 3000 ));
		lista.add(new Cargo("DBA", "trAINEE", 1500 ));
		lista.add(new Cargo("ANALISTA", "JR", 400 ));
		
		Collections.sort(lista);
		
		for(Cargo objeto : lista) {
			System.out.println(objeto.getNivel());
			System.out.println(objeto.getNome());
			System.out.println(objeto.getSalario());
			System.out.println("");
		
			
		}
		
	}

}
