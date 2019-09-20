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
	
	
	public Usuario getUser(int id) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM  TS_T_USUARIO WHERE ID_USUARIO=?");
		stmt.setInt(1, id);
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
		stmt.setInt(1, u.getId());
		stmt.setString(2, u.getNome());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getSenha());
		return stmt.executeUpdate();
	}
	
	public int killUser(int id) throws Exception{
		stmt = con.prepareStatement("delete from TS_T_USUARIO where ID_USUARIO =? ");
		stmt.setInt(1, id);
		return stmt.executeUpdate();
		
	}

	public Usuario loginUser(Usuario u)throws Exception{
		stmt = con.prepareStatement("SELECT * FROM TS_T_USUARIO WHERE EMAIL = ? AND SENHA = ?");
		stmt.setString(1, u.getEmail());
		stmt.setString(2, u.getSenha());
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			return this.getUser(rs.getInt("ID_USUARIO"));
		}else {
			return new Usuario();
		}
		
		
	}
	
	public int updateSenha(Usuario usuario, String senhaNova) throws Exception{

		String senhaAntinga = usuario.getSenha();

		int idUsuario = usuario.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_USUARIO SET SENHA =? WHERE ID_USUARIO=?");

		stmt.setString(1, senhaNova);
		stmt.setInt(2, idUsuario);


		return stmt.executeUpdate();

	}

	
	public int updateEmail(Usuario usuario, String emailNovo) throws Exception{

	   
		int idUsuario = usuario.getId();
		
		stmt = con.prepareStatement("UPDATE TS_T_USUARIO SET EMAIL =? WHERE ID_USUARIO=?");
		stmt.setString(1, emailNovo);
		stmt.setInt(2, idUsuario);

		return stmt.executeUpdate();

	}
	
	public void close() throws SQLException{
		con.close();
	}
	
}
