package fr.eni.javaee.ProjetEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.javaee.ProjetEncheres.bll.UtilisateurManager;

/**
 * Servlet implementation class PageConnexionServlet
 */
@WebServlet("/pageConnexion")
public class PageConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/PageConnexion.jsp");
		rd.forward(request, response);
	}

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pseudo = request.getParameter("pseudo");
		String motDePasse = request.getParameter("password");
		String destPage = "/WEB-INF/jsp/PageConnexion.jsp";
		UtilisateurManager utilisateurManager = new UtilisateurManager();

		if (utilisateurManager != null) {
			HttpSession session = request.getSession();
			session.setAttribute("utilisateurManager", utilisateurManager);
			destPage = "/WEB-INF/jsp/PageConnectee.jsp";
		} else {
			String message = "Invalid pseudo/password";
			request.setAttribute("message", message);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
		dispatcher.forward(request, response);
	}

}
