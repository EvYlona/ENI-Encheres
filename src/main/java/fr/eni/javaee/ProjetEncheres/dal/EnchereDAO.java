package fr.eni.javaee.ProjetEncheres.dal;

import java.util.List;
import fr.eni.javaee.ProjetEncheres.bo.Enchere;

public interface EnchereDAO {
	
	void insert(Enchere data) throws DALException;
	
	public List<Enchere> selectAll() throws DALException;
	
	public Enchere SelectById(Integer idEnchere) throws DALException;
	
	public void update(Enchere data) throws DALException;
	
	public void delete(Integer idEnchere) throws DALException;
	
}