package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegistracioniService;

/**
 * Servlet implementation class RegistracioniServlet
 */
@WebServlet(description = "ovo je servlet za registraciju novih korisnika", urlPatterns = { "/RegistracioniServlet" })
public class RegistracioniServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistracioniServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//preuzimanje parametara sa forme (iz URL-a)
		


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName"); 
		String password = request.getParameter("password");
		String repeatedPassword = request.getParameter("repeatedPassword");
		
		System.out.println("Dobrodosao " + userName);
		System.out.println("Tvoj pass je: " + password);
		System.out.println("Ponovio si " + repeatedPassword);
		
		//povezivanje sa servisom
		RegistracioniService service = new RegistracioniService();
		
		boolean proveraPassworda = service.daLiSuIstiPasswordi(password, repeatedPassword);
		
		if(proveraPassworda) {
			//upisivanje usera u bazu
			boolean daLiJeUpisaoUseraUbazu = service.upisiUseraUBazu(userName, password);
			
			if(daLiJeUpisaoUseraUbazu) {
				//idi na stranicu za uspesnu registraciju
				response.sendRedirect("htmlFajlovi/uspesnaRegistracija.html");
			}else {
				//idi na registracionu formu ponovo
				response.sendRedirect("htmlFajlovi/registracija.html");

			}
			
		}else {
			//idi na registracionu formu ponovo
			response.sendRedirect("htmlFajlovi/registracija.html");
		}
	}

}
