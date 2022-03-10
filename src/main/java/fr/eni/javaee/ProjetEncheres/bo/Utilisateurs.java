package fr.eni.javaee.ProjetEncheres.bo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Utilisateurs {

	// Attributs
	public int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private byte administrateur;
	// Association à la liste des encheres
	private List<Enchere> enchere;

	/*
	 * Constructeur Tout ce qui est en dessous des attributs et généré
	 * automatiquement
	 */
	public Utilisateurs() {
	}

	
	
	
	public Utilisateurs(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;

	}

	public Utilisateurs(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, byte administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;

		this.credit = credit;
		this.administrateur = administrateur;

	}

	// Getters/Setters
	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public byte getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(byte administrateur) {
		this.administrateur = administrateur;
	}

	// Getter pour la Liste qui retourne l'enchere
	public List<Enchere> getEnchere() {
		return enchere;
	}

	// Ajout d'une enchere
	public void addEnchere(ArticleVendu articleVendu, Date dateEnchere, Long montant_enchere, int noUtilisateur) {
		enchere.add(new Enchere(articleVendu, dateEnchere, montant_enchere, noUtilisateur));
	}

	// Retourne l'enchere selectionné si pas trouvé
	public Enchere getEnchere(int index) {
		return Enchere.get(index);
	}

	// Mettre à jour la liste
	public void updateEnchere(int index) {

	}

	// ToString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utilisateurs [noUtilisateur=");
		builder.append(noUtilisateur);
		builder.append(", pseudo=");
		builder.append(pseudo);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", rue=");
		builder.append(rue);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append(", ville=");
		builder.append(ville);
		builder.append(", motDePasse=");
		builder.append(motDePasse);
		builder.append(", credit=");
		builder.append(credit);
		builder.append(", administrateur=");
		builder.append(administrateur);
		builder.append("]");
		return builder.toString();
	}

	// Equals et HashCode
	@Override
	public int hashCode() {
		return Objects.hash(administrateur, codePostal, credit, email, motDePasse, noUtilisateur, nom, prenom, pseudo,
				rue, telephone, ville);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateurs other = (Utilisateurs) obj;
		return Objects.equals(administrateur, other.administrateur) && Objects.equals(codePostal, other.codePostal)
				&& credit == other.credit && Objects.equals(email, other.email)
				&& Objects.equals(motDePasse, other.motDePasse) && noUtilisateur == other.noUtilisateur
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(pseudo, other.pseudo) && Objects.equals(rue, other.rue)
				&& Objects.equals(telephone, other.telephone) && Objects.equals(ville, other.ville);
	}

}
