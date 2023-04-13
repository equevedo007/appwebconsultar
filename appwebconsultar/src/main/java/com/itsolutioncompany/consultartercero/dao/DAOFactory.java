package com.itsolutioncompany.consultartercero.dao;


import com.itsolutioncompany.consultartercero.interfaces.PersonaNaturalDAO;

public abstract class DAOFactory {

	public static final int MYSQL=1;
	
	public abstract PersonaNaturalDAO getPersonaNaturalDAO();
	
	
	public static DAOFactory getDAOFactory(int edinson){
		
		switch (edinson) {
		case MYSQL:
			
			return new MysqlDAOFactory();

		default:
			return null;
		}
		
	}
}
