package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Date;
import java.util.Objects;

public class Enchere {
		//Attributs
		public Date dateEnchere;
		public Long montant_enchere;
		//Informations à afficher d'autres classes
				public int noUtilisateur;
				public int  noArticle;
		//Associations
		private ArticleVendu articleVendu;
		private Utilisateurs utilisateurs;
		
		
		//Constructeur
		public Enchere(Date dateEnchere, Long montant_enchere, int noUtilisateur, int noArticle,
				ArticleVendu articleVendu, Utilisateurs utilisateurs) {
			super();
			this.dateEnchere = dateEnchere;
			this.montant_enchere = montant_enchere;
			this.noUtilisateur = noUtilisateur;
			this.noArticle = noArticle;
			this.articleVendu = articleVendu;
			this.utilisateurs = utilisateurs;
		}
		
		//Constructeur pour liste
		public Enchere(ArticleVendu articleVendu, Date dateEnchere, Long montant_enchere, int noUtilisateur) {
		}

		//Getter/Setter
		public Date getDateEnchere() {
			return dateEnchere;
		}

		public void setDateEnchere(Date dateEnchere) {
			this.dateEnchere = dateEnchere;
		}

		public Long getMontant_enchere() {
			return montant_enchere;
		}

		public void setMontant_enchere(Long montant_enchere) {
			this.montant_enchere = montant_enchere;
		}
		public int getNoUtilisateur() {
			return noUtilisateur;
		}

		public void setNoUtilisateur(int noUtilisateur) {
			this.noUtilisateur = noUtilisateur;
		}

		public int getNoArticle() {
			return noArticle;
		}

		public void setNoArticle(int noArticle) {
			this.noArticle = noArticle;
		}
		public ArticleVendu getArticleVendu() {
			return articleVendu;
		}

		public void setArticleVendu(ArticleVendu articleVendu) {
			this.articleVendu = articleVendu;
		}

		public Utilisateurs getUtilisateurs() {
			return utilisateurs;
		}

		public void setUtilisateurs(Utilisateurs utilisateurs) {
			this.utilisateurs = utilisateurs;
		}
		
		//Méthode
		public static Enchere get(int index) {
			return null;
		}
		
		//ToString
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Enchere [dateEnchere=");
			builder.append(dateEnchere);
			builder.append(", montant_enchere=");
			builder.append(montant_enchere);
			builder.append("]");
			return builder.toString();
		}
		
		//Equals et HashCode
		@Override
		public int hashCode() {
			return Objects.hash(dateEnchere, montant_enchere);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Enchere other = (Enchere) obj;
			return Objects.equals(dateEnchere, other.dateEnchere)
					&& Objects.equals(montant_enchere, other.montant_enchere);
		}

		

		

		

	
		
		
		
		
		

}
