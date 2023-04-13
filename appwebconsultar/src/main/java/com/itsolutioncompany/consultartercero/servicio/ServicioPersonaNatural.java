package com.itsolutioncompany.consultartercero.servicio;

import java.util.List;

import com.itsolutioncompany.consultartercero.bean.PersonaNaturalBean;
import com.itsolutioncompany.consultartercero.dao.DAOFactory;
import com.itsolutioncompany.consultartercero.interfaces.PersonaNaturalDAO;
import com.itsolutioncompany.consultartercero.utils.Constante;

public class ServicioPersonaNatural {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constante.ORIGEN_DE_DATOS);
	PersonaNaturalDAO objPersonaNaturalDAO = fabrica.getPersonaNaturalDAO();
	
	public List<PersonaNaturalBean> listatoralpersonanatual (){
		List<PersonaNaturalBean> lista=null;
		objPersonaNaturalDAO.totalPersonaNatural();
		return lista;
		
	}
	
	public PersonaNaturalBean consultarPersonaNaturalNUNDOC (String numdoc) {
		
		PersonaNaturalBean objPersonaNaturalBean=null;
		objPersonaNaturalBean=objPersonaNaturalDAO.consultarPersonaNaturalNUNDOC(numdoc);
		
		return objPersonaNaturalBean;
	}
	
	
	public PersonaNaturalBean consultarPersonaNaturalID (int id) {
		
		PersonaNaturalBean objPersonaNaturalBean=null;
		objPersonaNaturalBean=objPersonaNaturalDAO.consultarPersonaNaturalID(id);
		
		return objPersonaNaturalBean;
	}
	
	public List<PersonaNaturalBean> consultarpersonanaturalnombres(String nombres){
		List<PersonaNaturalBean> lista=null;
		lista=objPersonaNaturalDAO.consultarpersonanaturalnombres(nombres);
		return lista;
		
	}
	
	
}
