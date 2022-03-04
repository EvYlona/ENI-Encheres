package fr.eni.javaee.ProjetEncheres.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ArticleVendu {
	public int  noArticle;
	public String nomArticle;
	public String description;
	public Date dateDebutEncheres;
	public Date dateFinEncheres;
	public int miseAPrix;
	public int prixVente;
	public String etatVente;
	private Utilisateurs utilisateurs;
	private List<String> articleVendu = new ArrayList<String>();
	
	//Constructeur
	public ArticleVendu(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, String administrateur,
			int noArticle, String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
			int miseAPrix, int prixVente, String etatVente, List<String> articleVendu) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.articleVendu = articleVendu;
	}
	
	
	//Getters/Setter
	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}

	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	public long getMiseAPrix() {
		return miseAPrix;
	}

	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	public long getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public String getEtatVente() {
		return etatVente;
	}

	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}

	public int getNoArticle() {
		return noArticle;
	}
	

	public List<String> getArticleVendu() {
		return articleVendu;
	}


	public void setArticleVendu(List<String> articleVendu) {
		this.articleVendu = articleVendu;
	}
	
	
	//ToString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [noArticle=");
		builder.append(noArticle);
		builder.append(", nomArticle=");
		builder.append(nomArticle);
		builder.append(", description=");
		builder.append(description);
		builder.append(", dateDebutEncheres=");
		builder.append(dateDebutEncheres);
		builder.append(", dateFinEncheres=");
		builder.append(dateFinEncheres);
		builder.append(", miseAPrix=");
		builder.append(miseAPrix);
		builder.append(", prixVente=");
		builder.append(prixVente);
		builder.append(", etatVente=");
		builder.append(etatVente);
		builder.append("]");
		return builder.toString();
	}
	
	//Equals et HashCode
	@Override
	public int hashCode() {
		return Objects.hash(dateDebutEncheres, dateFinEncheres, description, etatVente, miseAPrix, noArticle,
				nomArticle, prixVente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticleVendu other = (ArticleVendu) obj;
		return Objects.equals(dateDebutEncheres, other.dateDebutEncheres)
				&& Objects.equals(dateFinEncheres, other.dateFinEncheres)
				&& Objects.equals(description, other.description) && Objects.equals(etatVente, other.etatVente)
				&& miseAPrix == other.miseAPrix && noArticle == other.noArticle
				&& Objects.equals(nomArticle, other.nomArticle) && prixVente == other.prixVente;
	}


	

	
}

