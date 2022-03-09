package fr.eni.javaee.ProjetEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import fr.eni.javaee.ProjetEncheres.bll.EnchereManager;
import fr.eni.javaee.ProjetEncheres.bll.UtilisateurManager;
import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;
import fr.eni.javaee.ProjetEncheres.dal.DALException;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAO;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAOJdbcImpl;

/**
 * Servlet implementation class PageCreerCompteServlet
 */


@WebServlet("/pageCreerCompte")
public class PageCreerCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/PageCreerCompte.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// étape 2 recup saisies utilisateur
		
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String rue = request.getParameter("rue");
		String codePostal = request.getParameter("codepostal");
		String ville = request.getParameter("ville");
		String motDePasse = request.getParameter("password");
		
			
		Utilisateurs utilisateur = new Utilisateurs(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
		
		// étape 4 verser les donner à la couche métier
		

		
		UtilisateurManager.insertById(utilisateur);

		response.sendRedirect("/PageListeEncheres");
	}

}
