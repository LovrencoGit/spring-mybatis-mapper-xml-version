package it.certimeter.blm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import it.certimeter.dao.IDAOUtente;
import it.certimeter.pojo.Utente;
import it.certimeter.query.QueryUtente;

@Scope("request")
public class BLMUtente implements IBLMUtente{
	
	@Autowired
//	private QueryUtente queryUtente;
	private IDAOUtente daoUtente;

	public IDAOUtente getDaoUtente() {
		return daoUtente;
	}
	
	public void setDaoUtente(IDAOUtente daoUtente) {
		this.daoUtente = daoUtente;
	}
	
	
	public Utente getUtenteByUsernameAndPassword(String username, String password) {		
//		return queryUtente.getUtenteByUsernameAndPassword(username, password);
		return daoUtente.getUtenteByUsernameAndPassword(username, password);
	}
}
