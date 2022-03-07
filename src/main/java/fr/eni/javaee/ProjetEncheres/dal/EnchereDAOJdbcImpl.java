package fr.eni.javaee.ProjetEncheres.dal;

public abstract class EnchereDAOJdbcImpl implements EnchereDAO {
	private final String SELECT_ALL = "select no_article, nom_article, description, date_debut_encheres, date_fin_encheres,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie from articles_vendus";

	//Getter et Setter
	public String getSELECT_ALL() {
		return SELECT_ALL;
	}

}
