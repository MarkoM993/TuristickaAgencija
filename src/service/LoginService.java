package service;

import model.User;

import javax.transaction.Transactional;

import dao.LoginDAO;

public class LoginService {

	LoginDAO dao = new LoginDAO();

	@Transactional
	public User vratiUseraLogin(String userName, String password) {
		
		return dao.vratiUseraLogin(userName, password);
	}
}
