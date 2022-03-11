package fr.eni.javaee.ProjetEncheres.dal;

import java.util.ArrayList;
import java.util.List;


public class DALException extends Exception {
	//Attributs
	private static final long serialVersionUID = 1L;
	private List<Integer> listeCodesErreurs;
	
	//Constructeur
	public DALException() {
		super();
		this.listeCodesErreurs=new ArrayList<>();
	}
	
	//getter listeCodesErreurs
	public List<Integer> getListeCodesErreurs() 
	{
		return listeCodesErreurs;
	}
	
	//Ajouter une erreurs présente dans UtilisateursManager
	public void ajouterErreur(int code) {
		if(!this.listeCodesErreurs.contains(code))
		{
			this.listeCodesErreurs.add(code);
		}
	}
		
	//Gérer l'erreur
	public List<Integer> hasErreurs() {
		return this.listeCodesErreurs;
	}

	

}
