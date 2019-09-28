package br.com.techsow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.techsow.beans.Endereco;
import br.com.techsow.beans.Pessoa;
import br.com.techsow.conexao.Conexao;

public class EnderecoDAO {

	private Connection con; 
	private PreparedStatement stmt;
	private ResultSet rs; 


	public EnderecoDAO() throws Exception{
		con = Conexao.conectar();
	}



	public Endereco getEndereco(int id) throws Exception{
		stmt = con.prepareStatement(
				" SELECT * FROM TS_T_ENDERECO WHERE ID_ENDERECO=?");

		stmt.setInt(1, id);
		rs = stmt.executeQuery();

		if(rs.next()) {

			return new Endereco(
					rs.getInt("ID_ENDERECO"),
					rs.getString("TP_LOGR"),
					rs.getString("BAIRRO"),
					rs.getString("LOGR"),
					rs.getString("CEP"),
					rs.getString("CIDADE"),
					rs.getString("UF"),
					rs.getInt("NUMERO"),
					new PessoaDAO().getPessoa(rs.getInt("TS_T_PESSOA_ID_PESSOA"))					
					);

		}else {
			return new Endereco();
		}
	}

	public int addEndereco(Endereco e) throws Exception{

		stmt = con.prepareStatement("INSERT INTO TS_T_ENDERECO(ID_ENDERECO, TP_LOGR, BAIRRO, LOGR, CEP,"
				+ "CIDADE, UF, NUMERO, TS_T_PESSOA_ID_PESSOA) values(?,?,?,?,?,?,?,?,?)");
	
		stmt.setInt(1, e.getId());
		stmt.setString(2, e.getTipoLogr());
		stmt.setString(3, e.getBairro());
		stmt.setString(4, e.getLogradouro());
		stmt.setString(5, e.getCep());
		stmt.setString(6, e.getCidade());
		stmt.setString(7, e.getUf());
		stmt.setInt(8, e.getNumero());
		stmt.setInt(9, e.getPessoa().getId());
		return stmt.executeUpdate();
	}


	// Pendente alterar esse método para receber pessoa e pegar o ID do endereco através do objeto pessoa. pessoa.getEndereco() ao inves de id do endereco. 
	public int killEndereco(int id) throws Exception{
		stmt = con.prepareStatement("DELETE FROM TS_T_ENDERECO WHERE ID_ENDERECO=?");
		stmt.setInt(1, id);
		return stmt.executeUpdate();

	}

	public int updateTipoLogr(Endereco endereco, String novoTipoLogr ) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET TP_LOGR=? WHERE ID_ENDERECO=?");
		stmt.setString(1, novoTipoLogr);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}

	public int updateBairro(Endereco endereco, String novoBairro) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET BAIRRO=? WHERE ID_ENDERECO=?");
		stmt.setString(1, novoBairro);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}

	public int updateLogr(Endereco endereco, String novoLogr) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET LOGR=? WHERE ID_ENDERECO=?");
		stmt.setString(1, novoLogr);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}
	
	public int updateCep(Endereco endereco, String novoCep) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET CEP=? WHERE ID_ENDERECO=?");
		stmt.setString(1, novoCep);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}
	
	public int updateCidae(Endereco endereco, String novoCidade) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET CIDADE=? WHERE ID_ENDERECO=?");
		stmt.setString(1, novoCidade);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}

	public int updateUf(Endereco endereco, String novoUf) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET UF=? WHERE ID_ENDERECO=?");
		stmt.setString(1, novoUf);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}


	public int updateNumero(Endereco endereco, int novoNumero) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement("UPDATE TS_T_ENDERECO SET NUMERO=? WHERE ID_ENDERECO=?");
		stmt.setInt(1, novoNumero);
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}
	
	public int setPessoa(Endereco endereco, Pessoa pessoa) throws Exception{

		int idEndereco = endereco.getId(); 
		stmt = con.prepareStatement(" TS_T_ENDERECO SET TS_T_PESSOA_ID_PESSOA=? WHERE ID_ENDERECO=?");
		stmt.setInt(1, pessoa.getId());
		stmt.setInt(2, idEndereco);
		return stmt.executeUpdate();
	}

	
	public void close() throws SQLException{
		con.close();
	}
	



}
