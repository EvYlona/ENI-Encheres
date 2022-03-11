package fr.eni.javaee.ProjetEncheres.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.javaee.ProjetEncheres.bll.UtilisateurManager;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAO;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAOJdbcImpl;


@WebServlet("/PageMonProfil")
public class PageMonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/PageMonProfil.jsp");
		rd.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        UtilisateursDAOJdbcImpl.SelectById("String pseudo, ");
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/PageMonProfil.jsp").forward(request, response);
	}

}
