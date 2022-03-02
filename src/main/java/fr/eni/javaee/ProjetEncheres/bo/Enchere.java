package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Date;

public class Enchere {
		//Attributs
		private Date dateEnchere;
		private Long montant_enchere;
		
		//Constructeur
		public Enchere(Date dateEnchere, Long montant_enchere) {
			super();
			this.dateEnchere = dateEnchere;
			this.montant_enchere = montant_enchere;
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
		
		
		
		
		

}
