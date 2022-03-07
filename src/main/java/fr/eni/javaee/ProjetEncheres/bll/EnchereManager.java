package fr.eni.javaee.ProjetEncheres.bll;

import fr.eni.javaee.ProjetEncheres.dal.DAOFactory;
import fr.eni.javaee.ProjetEncheres.dal.EnchereDAO;

public class EnchereManager {
	//Une seule instance de classe
	private static EnchereManager instance;
	private EnchereDAO enchereDAO;
	
	//Constructeur privé
	private EnchereManager() {
		//Appel à DAOFactory pour récupérer l'instance
		setEnchereDAO(DAOFactory.getEnchereDAO());
	}
	
	//Getter qui permet de créer l'instance
	public static EnchereManager getInstance() {
		if (instance == null) {
			instance = new EnchereManager();
		}
		return instance;
	}
	
	//Getter et Setter pour enchereDAO
	public EnchereDAO getEnchereDAO() {
		return enchereDAO;
	}

	public void setEnchereDAO(EnchereDAO enchereDAO) {
		this.enchereDAO = enchereDAO;
	}
	
}
