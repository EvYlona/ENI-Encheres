package fr.eni.javaee.ProjetEncheres.dal;

public class ArticleVenduDaoJdbcImpl implements ArticleVenduDao {
	private final String SELECT_ALL = "select no_article, nom_article, description, date_debut_encheres, date_fin_encheres,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie from articles_vendus";

}
