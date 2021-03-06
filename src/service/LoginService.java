package service;

import model.User;
import validacija.ValidacijaLogin;

import javax.transaction.Transactional;

import dao.LoginDAO;

public class LoginService {

	LoginDAO dao = new LoginDAO();
	
	ValidacijaLogin validacija = new ValidacijaLogin();

	
	public User vratiUseraLogin(String userName, String password) {
		
		return dao.vratiUseraLogin(userName, password);
	}


	public boolean daLiJeAdmin(User loginUser) {
		return validacija.daLiJeAdmin(loginUser);
	}
}
