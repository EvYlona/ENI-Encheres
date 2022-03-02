package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Date;
import java.util.Objects;

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
