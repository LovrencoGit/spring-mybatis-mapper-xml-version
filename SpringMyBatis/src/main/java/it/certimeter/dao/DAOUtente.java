package it.certimeter.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import it.certimeter.pojo.Utente;

public class DAOUtente extends SqlSessionDaoSupport implements IDAOUtente {

	@Override
	public Utente getUtenteByUsernameAndPassword(String username, String password) {
		Utente user = new Utente();
		SqlSession session = getSqlSession();
		
		HashMap<String, String> param = new HashMap<String, String>();
        param.put("username", username);
        param.put("password", password);
		final HashMap<String, String> parametri = param;
		
		try{
			user = session.selectOne("Utente.getUserByUsernameAndPassword", parametri);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		
		return user;
	}

}
