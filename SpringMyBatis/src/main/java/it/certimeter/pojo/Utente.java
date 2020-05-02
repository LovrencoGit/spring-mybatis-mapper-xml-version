package it.certimeter.pojo;

public class Utente {
	private String username;
	private String password;
	private int privilegi;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPrivilegi() {
		return privilegi;
	}
	public void setPrivilegi(int privilegi) {
		this.privilegi = privilegi;
	}
	
	
	@Override
	public String toString() {
		return "Utente {\n\tusername=" + username + ", \n\tpassword=" + password + ", \n\tprivilegi=" + privilegi
				+ "\n}";
	}
	
	
	
}
