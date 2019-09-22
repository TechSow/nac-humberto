package br.com.techsow.bo;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import br.com.techsow.beans.Usuario;
import br.com.techsow.dao.UsuarioDAO;

public class UsuarioBO {

	public String addUser(Usuario user) {

		if(user.getNome().length() < 5) {
			return "O nome não pode ter menos que 5 caracteres";
		}

		try {
			InternetAddress email = new InternetAddress(user.getEmail());
			email.validate();
		}catch(AddressException e) {
			return "E-mail inválido";
		}

		if(user.getSenha().length()  < 6) {
			return "A senha tem que ser maior que 6 caracteres.";
		}

		UsuarioDAO dao = null;
		Usuario verificarId = null;
		try {
			dao= new UsuarioDAO();
			verificarId = dao.getUser(user.getId());

		}catch(Exception e) {
			e.printStackTrace();
		}
		if(verificarId.getId() > 0) {
			return "O usuário já existe";
		}

		int ret = 0;
		try {
			ret = dao.addUser(user);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				dao.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if (ret == 0) {
			return "Houve um erro, por favor, tente mais tarde";
		}else {
			return "Usuario cadastrado com sucesso";
		}
	}


	/////////////////////////////////////////////////////////////////////

	public String deleteUser(int id) throws Exception{

		UsuarioDAO dao = null;
		int retorno =0;
		try {
			dao = new UsuarioDAO();	
			try {
				retorno = dao.killUser(id);
			}catch(Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dao.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		if (retorno == 1) {
			return "Usuario deletado com sucesso";
		}else {
			return "Usuario não pode ser deletado. Verificar as informações fornecidas";			
		}

	}













}
