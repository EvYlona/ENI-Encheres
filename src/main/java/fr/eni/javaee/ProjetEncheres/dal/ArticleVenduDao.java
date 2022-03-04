package fr.eni.javaee.ProjetEncheres.dal;

public interface ArticleVenduDao }

	    private String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=ENCHERES_DB";
	    private String jdbcUsername = "sa";
	    private String jdbcPassword = "pa$$w0rd";

	    	private static final String INSERT_ARTICLES_VENDUS ="INSERT INTO ArticleVendu" + " (no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES " + " (?, ?, ?, ?, ?, ?, ?, ?, ?);";
	    	
	    	
}