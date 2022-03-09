package fr.eni.javaee.ProjetEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class UtilisateursDAOJdbcImpl implements UtilisateursDAO {
		
	private static final String SELECT_BY_ID="";
	private static final String SELECT_BY_PASSWORD="";
	private static final String INSERT="INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
	private static final String UPDATE="";
	private static final String DELETE="";
	
	
			try(Connection cnx = ConnectionProvider.getConnection())
			{
				//Je veux ici récupérer la clés générée automatiquement
				PreparedStatement pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, utilisateurs.gePseudo());
				pstmt.setInt(2, utilisateurs.getNom());
				pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next())
				{
					avis.setIdentifiant(rs.getInt(1));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				if(e.getMessage().contains("CK_AVIS_note"))
				{
					businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC);
				}
				else
				{
					businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
				}
				throw businessException;
			}	
		}

	}
