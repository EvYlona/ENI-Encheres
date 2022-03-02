package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Date;

public class Categorie extends ArticleVendu {
		//Attributs
		 public int noCategorie;
		 public int libelle;
		 
		 //Constructeur avec superclass
		 public Categorie(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
					String rue, String codePostal, String ville, String motDePasse, int credit, String administrateur,
					int noArticle, String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
					int miseAPrix, int prixVente, String etatVente) {
				super(noUtilisateur, pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit, administrateur,
						noArticle, nomArticle, description, dateDebutEncheres, dateFinEncheres, miseAPrix, prixVente, etatVente);
			}
		
		//Getter/Setter
		public int getNoCategorie() {
			return noCategorie;
		}

		public void setNoCategorie(int noCategorie) {
			this.noCategorie = noCategorie;
		}

		public int getLibelle() {
			return libelle;
		}

		public void setLibelle(int libelle) {
			this.libelle = libelle;
		}
		
		
		
		
		 
		 
		 
	

}
