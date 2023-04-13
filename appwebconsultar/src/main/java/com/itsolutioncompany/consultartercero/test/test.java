package com.itsolutioncompany.consultartercero.test;

import java.util.ArrayList;
import java.util.List;

import com.itsolutioncompany.consultartercero.bean.PersonaNaturalBean;
import com.itsolutioncompany.consultartercero.servicio.ServicioPersonaNatural;


public class test {
	//Edinson Ismael Quevedo Holguin
	public static void main(String[] args) throws Exception  {
		
		List<PersonaNaturalBean> lista = new ArrayList<PersonaNaturalBean>();
		
		//PersonaNaturalBean objPersonaNaturalBean = new PersonaNaturalBean();
		
		ServicioPersonaNatural servicio = new ServicioPersonaNatural();
		
		lista = servicio.consultarpersonanaturalnombres("quevedo holguin");
		
		System.out.println("Nombres y Apellidos : " + lista.size());
	}

}
