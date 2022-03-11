package fr.eni.javaee.ProjetEncheres.bll;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;
import fr.eni.javaee.ProjetEncheres.dal.DALException;
import fr.eni.javaee.ProjetEncheres.dal.DAOFactory;
import fr.eni.javaee.ProjetEncheres.dal.ListeCodesErreurs;
import fr.eni.javaee.ProjetEncheres.dal.UtilisateursDAO;

public class UtilisateurManager {
	private  UtilisateursDAO utilisateurDao;

	
	public UtilisateurManager() {
		/*On apelle l'attribut défini ci-dessus et on récupère "getUtilisateursDAO" 
		de l'interface DAOFactory*/
		this.utilisateurDao =DAOFactory.getUtilisateursDAO();
	}

	//Méthode pour ajouter l'utilisateur avec tout ses paramètres
	public Utilisateurs ajouterUtilisateur (String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, byte administrateur) throws DALException {
			
		//On valide les paramètres en gérant les exceptions
		DALException dalException = new DALException();
		this.validerPseudo(pseudo, dalException);
		this.validerNom(nom, dalException);
		this.validerPrenom(prenom, dalException);
		this.validerEmail(email, dalException);
		this.validerTelephone(telephone, dalException);
		this.validerRue(rue, dalException);
		this.validerCodePostal(codePostal, dalException);
		this.validerVille(ville, dalException);
		this.validerMotDePasse(motDePasse, dalException);
		
		if (!dalException.hasErreurs()) {
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
			utilisateur.setAdministrateur(administrateur);
	
			this.utilisateurDao.insertById(utilisateur);
	} else{
		throw dalException;
	}
			return utilisateurDao;
	}

	private void validerMotDePasse(String motDePasse, DALException dalException) {
		if (motDePasse == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_MOT_DE_PASSE_NULL);
		}
	}

	private void validerVille(String ville, DALException dalException) {
		if (ville == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_VILLE_NULL);
		}
		
	}

	private void validerCodePostal(String codePostal, DALException dalException) {
		if (codePostal == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_CODE_POSTAL_NULL);
		}
		
	}

	private void validerRue(String rue, DALException dalException) {
		if (rue == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_RUE_NULL);
		}
		
	}

	private void validerTelephone(String telephone, DALException dalException) {
		if (telephone == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_TELEPHONE_NULL);
		}
		
	}

	private void validerEmail(String email, DALException dalException) {
		if (email == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_EMAIL_NULL);
		}
		
	}

	private void validerPrenom(String prenom, DALException dalException) {
		if (prenom == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_PRENOM_NULL);
		}
		
	}

	private void validerNom(String nom, DALException dalException) {
		if (nom == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_NOM_NULL);
		}
		
	}

	private void validerPseudo(String pseudo, DALException dalException) {
		if (pseudo == null) {
			dalException.ajouterErreur(ListeCodesErreurs.INSERT_PSEUDO_NULL);
		}
		
	}
}