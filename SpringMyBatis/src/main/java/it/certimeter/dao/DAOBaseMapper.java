package it.certimeter.dao;

import org.apache.ibatis.session.SqlSessionFactory;

public class DAOBaseMapper {
	   protected SqlSessionFactory sqlSessionFactory = null;
		 
	    public DAOBaseMapper(SqlSessionFactory sqlSessionFactory){
	        this.sqlSessionFactory = sqlSessionFactory;
	    }
}
