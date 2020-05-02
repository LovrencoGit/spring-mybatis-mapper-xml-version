package it.certimeter.query;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import it.certimeter.pojo.Utente;

public interface QueryUtente {
	@Select("SELECT username as username, password as password, privilegi as privilegi FROM utenti "
			+ "WHERE username = #{username} and password = #{password}")
	public Utente getUtenteByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}
