package br.com.techsow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.techsow.beans.Materia;
import br.com.techsow.conexao.Conexao;

public class MateriaDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public MateriaDAO() throws Exception {
		con=Conexao.conectar();
		
	}
	
	//Adicionado o ultimo campo para a tabela de relacionamento materia/curso, necessario entender como passar esse campo
	public int addMateria(Materia m)throws Exception{
		stmt=con.prepareStatement("insert into TS_T_MATERIA(ID_MATERIA,ID_CURSO,NOME,EMENTA, TS_T_CURSO_ID_CURSO)VALUES(?,?,?,?,1)");
		stmt.setInt(1, m.getId());
		stmt.setInt(2, m.getId_curso().getId());
		stmt.setString(3, m.getNome());
		stmt.setString(4, m.getEmenta());
		return stmt.executeUpdate();
	}	
	
		//VOU REVER SEGUNDA
	public Materia getMateria(int cod)throws Exception{
		stmt=con.prepareStatement("SELECT * FROM TS_T_MATERIA WHERE ID_MATERIA=?");
		stmt.setInt(1, cod);
		rs=stmt.executeQuery();
		if(rs.next()) {
			return new Materia(
					rs.getInt("ID_MATERIA"),
					new CursoDAO().getCurso(rs.getInt("ID_CURSO")),
					rs.getString("NOME"),
					rs.getString("EMENTA"));
			
		}else {

			return new Materia();
		}
		
	}
	public int killMateria(int cod)throws Exception{
		stmt=con.prepareStatement("DELETE  FROM TS_T_MATERIA WHERE ID_MATERIA=?");
		stmt.setInt(1, cod);
		return stmt.executeUpdate();
		
	}
	public int UpdateNome(Materia m,String nomeNovo)throws Exception{
		stmt=con.prepareStatement("UPDATE TS_T_MATERIA SET NOME=? WHERE ID_MATERIA=?" );
		stmt.setString(1, nomeNovo);
		stmt.setInt(1, m.getId());
		return stmt.executeUpdate();
	}
	public int UpdateEmenta(Materia m,String novaEmenta)throws Exception{
		stmt=con.prepareStatement("UPDATE TS_T_MATERIA WHERE ID_MATERIA=?");
		stmt.setString(2, novaEmenta);
		stmt.setInt(1, m.getId());
		return stmt.executeUpdate();
	}
	public void close()throws SQLException{
		con.close();
	}
}
