package com.itsolutioncompany.consultartercero.interfaces;

import java.util.List;

import com.itsolutioncompany.consultartercero.bean.PersonaNaturalBean;

public interface PersonaNaturalDAO {
	
	public abstract List<PersonaNaturalBean> totalPersonaNatural ();
	
	public abstract PersonaNaturalBean consultarPersonaNaturalNUNDOC(String NUNDOC);
	
	public abstract PersonaNaturalBean consultarPersonaNaturalID(int ID);
	
	public abstract List<PersonaNaturalBean> consultarpersonanaturalnombres (String nombres);

}
