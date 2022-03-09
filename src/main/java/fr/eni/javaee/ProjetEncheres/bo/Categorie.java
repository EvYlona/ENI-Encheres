package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Objects;

public class Categorie {
		//Attributs
		 public int noCategorie;
		 public int libelle;
		 //Association
		 private ArticleVendu articleVendu;
		 
		 //Constructeur 
		 public Categorie(int noCategorie, int libelle) {
				super();
				this.noCategorie = noCategorie;
				this.libelle = libelle;
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
		public ArticleVendu getArticleVendu() {
			return articleVendu;
		}

		public void setArticleVendu(ArticleVendu articleVendu) {
			this.articleVendu = articleVendu;
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
