package br.com.techsow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.techsow.beans.Usuario;
import br.com.techsow.conexao.Conexao;

public class UsuarioDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public UsuarioDAO() throws Exception{
		con=Conexao.conectar();
	}
	
	
	public Usuario getUser(long id) throws Exception{
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
	
	
	public int addUser(Usuario u)throws Exception{
		stmt=con.prepareStatement("insert into TS_T_USUARIO (ID_USUARIO,NOME,EMAIL,SENHA) values(?,?,?,?)");
		stmt.setLong(1, u.getId());
		stmt.setString(2, u.getNome());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getSenha());
		return stmt.executeUpdate();
	}
	
	//public int killUser(Usuario u)throws Except

	public void close() throws SQLException{
		con.close();
	}
	
}
