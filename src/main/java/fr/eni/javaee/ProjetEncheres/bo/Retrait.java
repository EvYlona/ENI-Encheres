package fr.eni.javaee.ProjetEncheres.bo;

public class Retrait {
		private String rue;
		private int code_postal;
		private String ville;
		
		//Constructeur généré aussi automatiquement, comme tout ce qui suit
		public Retrait(String rue, int code_postal, String ville) {
			super();
			this.rue = rue;
			this.code_postal = code_postal;
			this.ville = ville;
		}

		//Getter/Setter
		public String getRue() {
			return rue;
		}

		public void setRue(String rue) {
			this.rue = rue;
		}

		public int getCode_postal() {
			return code_postal;
		}

		public void setCode_postal(int code_postal) {
			this.code_postal = code_postal;
		}

		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

		//ToString
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Retrait [rue=");
			builder.append(rue);
			builder.append(", code_postal=");
			builder.append(code_postal);
			builder.append(", ville=");
			builder.append(ville);
			builder.append("]");
			return builder.toString();
		}
		
		
		
		
		
		
	

}
