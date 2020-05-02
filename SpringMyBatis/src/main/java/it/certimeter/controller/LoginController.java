package it.certimeter.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.certimeter.blm.IBLMUtente;
import it.certimeter.pojo.Utente;
import it.certimeter.sessione.Sessione;

@Controller
@Scope("request")

public class LoginController {

	Logger log = Logger.getLogger(LoginController.class);
	
	@Autowired
	private IBLMUtente blmUtente;
	private Sessione sessione;

	public Sessione getSessione() {
		return sessione;
	}

	public void setSessione(Sessione sessione) {
		this.sessione = sessione;
	}

	public IBLMUtente getBlmUtente() {
		return blmUtente;
	}

	public void setBlmUtente(IBLMUtente blmUtente) {
		this.blmUtente = blmUtente;
	}

	
	
	@RequestMapping("/login")
	public String login() {
		log.info("/LOGIN");
		return "login";
	}
	
	@RequestMapping(value={"/loggato","/index"})
	public String loggato() {
		log.info("/LOGGATO - /INDEX");
		if(sessione.getPrivilegi()==1) return "admin";
		return "login";
	}
	
	@RequestMapping("/checkLogin")
	@ResponseBody
	public ResponseEntity<String> checkLogin(@RequestParam(value = "usernameInput") String usernameInput,
			@RequestParam(value = "passwordInput") String passwordInput) {
		log.info("/CHECKLOGIN");
		Utente utente = blmUtente.getUtenteByUsernameAndPassword(usernameInput, passwordInput);
		log.debug( utente.toString() );
		
		if( utente.getUsername() != null && utente.getPassword() != null ) {
			log.debug("[LOGIN SUCCESS] Utente != null");
			sessione.setUsername(usernameInput);
			sessione.setPrivilegi(utente.getPrivilegi());
			return new ResponseEntity<String>("OK",HttpStatus.OK);
		}else{
			log.debug("[LOGIN FAILURE] Utente == null");
			return new ResponseEntity<String>("Login failure",HttpStatus.OK);
		}
	}
	
	@RequestMapping("/logout")
	public String logout() {
		log.info("/LOGOUT");
		sessione.invalida();
		return "login";
	}
}
