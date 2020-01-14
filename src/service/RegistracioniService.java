package service;

import dao.RegistracijaDAO;
import validacija.ValidacijaRegistracije;

public class RegistracioniService {

	//povezivanje sa validacijom
	ValidacijaRegistracije validacija = new ValidacijaRegistracije();
	
	//povezivanje sa dao klasom
	RegistracijaDAO dao = new RegistracijaDAO();
	
	public boolean daLiSuIstiPasswordi(String password, String repeatedPassword) {
		return validacija.daLiSuIstiPasswordi(password, repeatedPassword);
	}

	public boolean upisiUseraUBazu(String userName, String password) {
		return dao.upisiUseraUBazu(userName, password);
	}
}
