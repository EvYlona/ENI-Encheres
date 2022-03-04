package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Date;
import java.util.Objects;

public class Categorie {
		//Attributs
		 public int noCategorie;
		 public int libelle;
		 
		 //Constructeur avec superclass
		 public Categorie(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
					String rue, String codePostal, String ville, String motDePasse, int credit, String administrateur,
					int noArticle, String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
					int miseAPrix, int prixVente, String etatVente) {
				super();
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
		
		//ToString
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Categorie [noCategorie=");
			builder.append(noCategorie);
			builder.append(", libelle=");
			builder.append(libelle);
			builder.append("]");
			return builder.toString();
		}
		
		//Equals et HashCode
		@Override
		public int hashCode() {
			return Objects.hash(libelle, noCategorie);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Categorie other = (Categorie) obj;
			return libelle == other.libelle && noCategorie == other.noCategorie;
		}
		
		
		
		
		
		
		
		
		
		 
		 
		 
	

}
