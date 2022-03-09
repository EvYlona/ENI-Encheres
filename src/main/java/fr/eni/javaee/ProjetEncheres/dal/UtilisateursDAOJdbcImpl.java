package fr.eni.javaee.ProjetEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.javaee.ProjetEncheres.bo.Utilisateurs;

abstract class UtilisateursDAOJdbcImpl implements UtilisateursDAO {
	
	private static final String SELECT_BY_ID="SELECT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville) VALUES(?,?,?,?,?,?,?,?);";
	private static final String SELECT_BY_PSEUDO="SELECT INTO UTILISATEURS(pseudo) VALUE(?);";
	private static final String SELECT_BY_MOT_DE_PASSE="SELECT INTO UTILISATEURS(mot_de_passe) VALUE(?);";
	private static final String INSERT_BY_ID="INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
	private static final String UPDATE_BY_ID="UPDATE INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe) VALUES(?,?,?,?,?,?,?,?,?);";
	private static final String DELETE_BY_ID="DELETE INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
	
	//Méthode SelectById
	public void SelectById(Utilisateurs utilisateurs) throws DALException {
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			//Getters and Setters
				//On récupère les clés générées
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, utilisateurs.getPseudo());
				pstmt.setString(2, utilisateurs.getNom());
				pstmt.setString(3, utilisateurs.getPrenom());
				pstmt.setString(4, utilisateurs.getEmail());
				pstmt.setString(5, utilisateurs.getTelephone());
				pstmt.setString(6, utilisateurs.getRue());
				pstmt.setString(7, utilisateurs.getCodePostal());
				pstmt.setString(8, utilisateurs.getVille());
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next())
				{
					utilisateurs.setNoUtilisateur(rs.getInt(1));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Méthode SelectByPseudo
	public void SelectByPseudo(Utilisateurs utilisateurs) throws DALException {
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			//Getters and Setters
				//On récupère les clés générées
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_PSEUDO, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, utilisateurs.getPseudo());
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next())
				{
					utilisateurs.setPseudo(rs.getString(1));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Méthode SelectByMotDePasse
	public void SelectByMotDePasse(Utilisateurs utilisateurs) throws DALException {
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			//Getters and Setters
				//On récupère les clés générées
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_MOT_DE_PASSE, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, utilisateurs.getMotDePasse());
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next())
				{
					utilisateurs.setMotDePasse(rs.getString(1));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Méthode InsertById
	public void InsertById(Utilisateurs utilisateurs) throws DALException {
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			//Getters pour nouvel utilisateur
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_BY_ID, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, utilisateurs.getPseudo());
				pstmt.setString(2, utilisateurs.getNom());
				pstmt.setString(3, utilisateurs.getPrenom());
				pstmt.setString(4, utilisateurs.getEmail());
				pstmt.setString(5, utilisateurs.getTelephone());
				pstmt.setString(6, utilisateurs.getRue());
				pstmt.setString(7, utilisateurs.getCodePostal());
				pstmt.setString(8, utilisateurs.getVille());
				pstmt.setString(9, utilisateurs.getMotDePasse());
				pstmt.setInt(10, utilisateurs.getCredit());
				pstmt.setString(11, utilisateurs.getAdministrateur());
				pstmt.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Méthode UpdateById
		public void UpdateById(Utilisateurs utilisateurs) throws DALException {
			
			try(Connection cnx = ConnectionProvider.getConnection())
			{
				//Getters et Setter pour modifier l'utilisateur
					PreparedStatement pstmt = cnx.prepareStatement(UPDATE_BY_ID, PreparedStatement.RETURN_GENERATED_KEYS);
					pstmt.setString(1, utilisateurs.getPseudo());
					pstmt.setString(2, utilisateurs.getNom());
					pstmt.setString(3, utilisateurs.getPrenom());
					pstmt.setString(4, utilisateurs.getEmail());
					pstmt.setString(5, utilisateurs.getTelephone());
					pstmt.setString(6, utilisateurs.getRue());
					pstmt.setString(7, utilisateurs.getCodePostal());
					pstmt.setString(8, utilisateurs.getVille());
					pstmt.setString(9, utilisateurs.getMotDePasse());
					pstmt.executeUpdate();
					ResultSet rs = pstmt.getGeneratedKeys();
					if(rs.next())
					{
						utilisateurs.setPseudo(rs.getString(1));
						utilisateurs.setNom(rs.getString(2));
						utilisateurs.setPrenom(rs.getString(3));
						utilisateurs.setEmail(rs.getString(4));
						utilisateurs.setTelephone(rs.getString(5));
						utilisateurs.setRue(rs.getString(6));
						utilisateurs.setCodePostal(rs.getString(7));
						utilisateurs.setVille(rs.getString(8));
						utilisateurs.setMotDePasse(rs.getString(9));
					}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Méthode DeleteById
		public void DeleteById(Utilisateurs utilisateurs) throws DALException {
			
			try(Connection cnx = ConnectionProvider.getConnection())
			{
				//Getters pour nouvel utilisateur
					PreparedStatement pstmt = cnx.prepareStatement(DELETE_BY_ID, PreparedStatement.RETURN_GENERATED_KEYS);
					pstmt.setString(1, utilisateurs.getPseudo());
					pstmt.setString(2, utilisateurs.getNom());
					pstmt.setString(3, utilisateurs.getPrenom());
					pstmt.setString(4, utilisateurs.getEmail());
					pstmt.setString(5, utilisateurs.getTelephone());
					pstmt.setString(6, utilisateurs.getRue());
					pstmt.setString(7, utilisateurs.getCodePostal());
					pstmt.setString(8, utilisateurs.getVille());
					pstmt.setString(9, utilisateurs.getMotDePasse());
					pstmt.setInt(10, utilisateurs.getCredit());
					pstmt.setString(11, utilisateurs.getAdministrateur());
					pstmt.executeUpdate();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
	
	
		
