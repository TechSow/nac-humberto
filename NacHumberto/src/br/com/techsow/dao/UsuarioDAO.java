package br.com.techsow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.techsow.beans.Usuario;
import br.com.techsow.conexao.Conexao;

public class UsuarioDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public UsuarioDAO() throws Exception{
		con=Conexao.conectar();
	}
	
	
	public Usuario getUser(int id) throws Exception{
		stmt = con.prepareStatement("SELECT FROM * TS_T_USUARIO WHERE ID_USUARIO=?");
		stmt.setLong(1, id);
		rs=stmt.executeQuery();
		
		if(rs.next()) {
			return new Usuario(
					rs.getInt("ID_USUARIO"),
					rs.getString("NOME"),
					rs.getString("EMAIL"),
					rs.getString("SENHA"));
		}else {
			return new Usuario();
		}
	}

}
