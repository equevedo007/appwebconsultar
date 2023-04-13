package com.itsolutioncompany.consultartercero.dao;

import com.itsolutioncompany.consultartercero.interfaces.PersonaNaturalDAO;

public class MysqlDAOFactory extends DAOFactory {

	@Override
	public PersonaNaturalDAO getPersonaNaturalDAO() {
		// TODO Auto-generated method stub
		return new MysqlPersonaNatural();
	}

	
	

}
