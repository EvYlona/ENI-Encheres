package fr.eni.javaee.ProjetEncheres.dal;

public class DAOFactory {
	public static EnchereDAO getEnchereDAO() {
		return new EnchereDAOJdbcImpl();
	}

}
