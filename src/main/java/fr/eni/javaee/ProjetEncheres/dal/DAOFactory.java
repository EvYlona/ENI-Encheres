package fr.eni.javaee.ProjetEncheres.dal;

public class DAOFactory {
	
	public static UtilisateursDAOJdbcImpl getUtilisateursDAO()
	{
		return new UtilisateursDAOJdbcImpl();
	}
}
