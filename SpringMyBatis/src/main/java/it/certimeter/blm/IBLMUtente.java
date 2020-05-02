package it.certimeter.blm;

import it.certimeter.pojo.Utente;

public interface IBLMUtente {
	public Utente getUtenteByUsernameAndPassword(String username, String password);
}
