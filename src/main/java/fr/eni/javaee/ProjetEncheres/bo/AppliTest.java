package fr.eni.javaee.ProjetEncheres.bo;

import java.util.ArrayList;
import java.util.List;

public class AppliTest {
	//Attributs
	private List<ArticleVendu> articles;
	
	//Constructeur par défaut
	public AppliTest() {
		
		//Constituer une liste d'articles à vendre
		articles = new ArrayList<>();
	}
		/*On veut récupérer les informations du nouvel article à vendre
		 * Ajouter un article à la liste des articles à vendre
		 * L'indexer ou faire des catégories
		 * Afficher l'état de la vente*/
	
	//Getter et Setter
	public List<ArticleVendu> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleVendu> articles) {
		this.articles = articles;
	}
	
}
