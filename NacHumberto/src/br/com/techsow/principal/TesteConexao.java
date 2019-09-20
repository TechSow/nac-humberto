package br.com.techsow.principal;

import java.sql.Connection;

import br.com.techsow.conexao.Conexao;

public class TesteConexao {

	public static void main(String[] args) {
		Connection con=null;
		try {
			con=Conexao.conectar();
			System.out.println("Conectou!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
