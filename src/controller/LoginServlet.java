package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "ovo je servlet za login", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		LoginService service = new LoginService();
		
		//vracamo usera iz baze
		User loginUser = service.vratiUseraLogin(userName,password);
		//pravim session object
		HttpSession session = request.getSession();
		//smestam usera u sesiju
		session.setAttribute("userIzBaze", loginUser );
		
		
		if(loginUser != null) {
			
			boolean daLiJeAdmin = service.daLiJeAdmin(loginUser);
			
			if(daLiJeAdmin) {
				response.sendRedirect("view/adminPage.jsp");
			}else {
				response.sendRedirect("view/userPage.jsp");
			}
			
		}else {
			response.sendRedirect("htmlFajlovi/login.html");
		}
		
		
	}

}
