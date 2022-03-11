package fr.eni.javaee.ProjetEncheres.dal;

public abstract class ListeCodesErreurs {
	
	//Gestion des erreurs dans UtilisateurManager
	//Echec à l'insertion d'un mot de passe null 
	public static final int INSERT_MOT_DE_PASSE_NULL= 1001;
	
	//Echec à l'insertion d'une ville null
	public static final int INSERT_VILLE_NULL = 1002;

	//Eches à l'insertion d'un codePostal null
	public static final int INSERT_CODE_POSTAL_NULL = 1003;

	//Echec à l'insertion d'une rue null
	public static final int INSERT_RUE_NULL = 1004;

	//Echec à l'insertion d'un telephone null
	public static final int INSERT_TELEPHONE_NULL = 1005;

	//Echec à l'insertion d'un email null
	public static final int INSERT_EMAIL_NULL = 1006;

	//Echec à l'insertion d'un prenom null
	public static final int INSERT_PRENOM_NULL = 1007;

	//Echec à l'insertion d'un nom null
	public static final int INSERT_NOM_NULL = 1008;

	//Echec à l'insertion d'un pseudo null
	public static final int INSERT_PSEUDO_NULL = 1009;
	
	//Gestion des erreurs dans UtilisateursDAOJdbcImpl
	//Echec de l'insertion d'un objet null 
	public static final int INSERT_OBJET_NULL = 1010;

	//Echec de l'insertion de l'objet
	public static final int INSERT_OBJET_ECHEC = 1011;
	

	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
