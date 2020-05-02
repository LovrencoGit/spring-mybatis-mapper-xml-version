package it.certimeter.dao;

import it.certimeter.pojo.Utente;

public interface IDAOUtente extends IDAOBaseMapper {
	
	public Utente getUtenteByUsernameAndPassword(String username, String password);
	
}
