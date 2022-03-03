package fr.eni.javaee.ProjetEncheres.dal;

public class DAOFactory {

	public ArticleVenduDaoJdbcImpl DAOFactory() {
		ArticleVenduDaoJdbcImpl getArticleVendu() {
			return new ArticleVenduDaoJdbcImpl();
		}

	}

}
