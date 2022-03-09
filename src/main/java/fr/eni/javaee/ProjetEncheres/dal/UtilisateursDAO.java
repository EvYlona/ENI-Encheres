package fr.eni.javaee.ProjetEncheres.dal;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;

public interface UtilisateursDAO {

	public void SelectById(Utilisateurs utilisateur) throws DALException;
	public void SelectByPseudo (Utilisateurs utilisateur) throws DALException;
	public void SelectByMotDePasse(Utilisateurs utilisateur);
	public void insertById (Utilisateurs utilisateur);
	public void updateById(Utilisateurs utilisateur) throws DALException;
	public void deleteById(Utilisateurs utilisateurs) throws DALException;

}
