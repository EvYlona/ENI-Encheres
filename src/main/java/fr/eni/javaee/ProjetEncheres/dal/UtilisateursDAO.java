package fr.eni.javaee.ProjetEncheres.dal;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;

public interface UtilisateursDAO {

	public void select_by_id(Utilisateurs utilisateurs) throws DALException;
	public void select_by_password(Utilisateurs utilisateurs) throws DALException;
	public void insert(Utilisateurs utilisateurs) throws DALException;
	public void update(Utilisateurs utilisateurs) throws DALException;
	public void delete(Utilisateurs utilisateurs) throws DALException;

}
