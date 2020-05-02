package it.certimeter.sessione;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Sessione {
	private String username;
	private int privilegi = -1;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPrivilegi() {
		return privilegi;
	}
	public void setPrivilegi(int privilegi) {
		this.privilegi = privilegi;
	}
	
	public void invalida(){
		username = null;
		privilegi = -1;
	}
}
