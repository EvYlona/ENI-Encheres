package fr.eni.javaee.ProjetEncheres.bll;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;
import fr.eni.javaee.ProjetEncheres.dal.DAOFactory;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAOJdbcImpl;

public class UtilisateurManager {
	private static UtilisateursDAOJdbcImpl utilisateurDao = (UtilisateursDAOJdbcImpl) DAOFactory.getUtilisateursDAO();


	public static void insertById(Utilisateurs utilisateurs){
		
		utilisateurDao.insertById(utilisateurs);
		
	}
	
	
		
	
}
