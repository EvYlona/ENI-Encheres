package fr.eni.javaee.ProjetEncheres.bo;

import java.util.ArrayList;
import java.util.List;

public class AppliTest {
	//Attributs
	private List<ArticleVendu> articles;
	private float nbrArticle;
	
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
	//Retourne l'article indexé
	public ArticleVendu getArticleVendu(int index) {
		return articles.get(index);
	}

	public void setArticles(List<ArticleVendu> articles) {
		this.articles = articles;
	}

	public float getNbrArticle() {
		return nbrArticle;
	}

	public void setNbrArticle(float nbrArticle) {
		this.nbrArticle = nbrArticle;
	}
	
	//Ajout d'un article à la liste des object vendus
	public void addArticleVendu() {
		return ;
	}
	
}
