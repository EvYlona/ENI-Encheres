package fr.eni.javaee.ProjetEncheres.dal;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;

public interface UtilisateursDAO {

	public Utilisateurs SelectById(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville) throws DALException;
	public Utilisateurs SelectByPseudo (String pseudo) throws DALException;
	public Utilisateurs SelectByMotDePasse(String motDePasse);
	public Utilisateurs insertById (String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) throws DALException;
	public Utilisateurs updateById(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) throws DALException;
	public Utilisateurs deleteById(Utilisateurs utilisateurs) throws DALException;

}
