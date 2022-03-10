package fr.eni.javaee.ProjetEncheres.bll;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;
import fr.eni.javaee.ProjetEncheres.dal.DAOFactory;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAO;

public class UtilisateurManager {
	private  UtilisateursDAO utilisateurDao;


	public UtilisateurManager() {
		this.utilisateurDao =DAOFactory.getUtilisateursDAO();
	}


	public Utilisateurs ajouterUtilisateur (String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, byte adminsttrateur) {
			
		Utilisateurs utilisateur = null;
		utilisateur = new Utilisateurs();
		utilisateur.setPseudo(pseudo);
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setEmail(email);
		utilisateur.setTelephone(telephone);
		utilisateur.setRue(rue);
		utilisateur.setCodePostal(codePostal);
		utilisateur.setVille(ville);
		utilisateur.setMotDePasse(motDePasse);
		utilisateur.setCredit(credit);
		utilisateur.setAdministrateur(adminsttrateur);
		
		this.utilisateurDao.insertById(utilisateur);
		
		return utilisateur;
		
	}
	
	
		
	
}
