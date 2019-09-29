package br.com.techsow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.techsow.beans.Curso;
import br.com.techsow.conexao.Conexao;


public class CursoDAO {
	
	private Connection con;
	private ResultSet rs;
	private PreparedStatement stmt;

	public CursoDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	public int addCurso(Curso c) throws Exception {
		stmt = con.prepareStatement("INSERT INTO TS_T_CURSO(ID_CURSO,NOME,DESCRICAO,DURACAO)VALUES(?,?,?,?)");
		stmt.setInt(1, c.getId());
		stmt.setString(2, c.getNome());
		stmt.setString(3, c.getDescricao());
		stmt.setInt(4, c.getDuracao());
		return stmt.executeUpdate();
	}

	public Curso getCurso(int cod) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM TS_T_CURSO WHERE ID_CURSO=?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return new Curso(rs.getInt("ID_CURSO"), rs.getString("NOME"), rs.getString("DESCRICAO"));

		} else {
			return new Curso();
		}
	}

	public int UpdateNome(Curso c, String nomeNovo) throws Exception {
		stmt = con.prepareStatement("UPDATE TS_T_CURSO SET NOME=? WHERE ID_MATERIA=?");
		stmt.setString(1, nomeNovo);
		stmt.setInt(2, c.getId());
		return stmt.executeUpdate();

	}

	public int UpdateDescricao(Curso c, String novaDescricao) throws Exception {
		stmt = con.prepareStatement("UPDATE TS_T_CURSO SET DESCRICAO=? WHERE ID_CURSO=?");
		stmt.setString(1, novaDescricao);
		stmt.setInt(2, c.getId());
		return stmt.executeUpdate();
	}

	public int killCurso(Curso c) throws Exception {
		stmt = con.prepareStatement("DELETE FROM TS_T_CURSO WHERE ID_CURSO=?");
		stmt.setInt(1, c.getId());
		return stmt.executeUpdate();
	}

	public void close() throws Exception {
		con.close();
	}
}
