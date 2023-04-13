package com.itsolutioncompany.consultartercero.managed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import com.itsolutioncompany.consultartercero.bean.PersonaNaturalBean;
import com.itsolutioncompany.consultartercero.servicio.ServicioPersonaNatural;



@ViewScoped
@ManagedBean(name="personanatural")
public class PersonaNaturalManaged implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String dni;
	private String nombres;
	private List<PersonaNaturalBean> listaPersonaNaturalBean = new ArrayList<PersonaNaturalBean>();;
	private PersonaNaturalBean objPersonaNaturalBean = new PersonaNaturalBean();


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public List<PersonaNaturalBean> getListaPersonaNaturalBean() {
		return listaPersonaNaturalBean;
	}

	public void setListaPersonaNaturalBean(List<PersonaNaturalBean> listaPersonaNaturalBean) {
		this.listaPersonaNaturalBean = listaPersonaNaturalBean;
	}

	public PersonaNaturalBean getObjPersonaNaturalBean() {
		return objPersonaNaturalBean;
	}

	public void setObjPersonaNaturalBean(PersonaNaturalBean objPersonaNaturalBean) {
		this.objPersonaNaturalBean = objPersonaNaturalBean;
	}
	
	

	public void buscarPersonanatural() throws Exception{		
		FacesContext context = FacesContext.getCurrentInstance();
		//context.addMessage(null, new FacesMessage("Se debe de ingresar",  "Mensaje de Prueba") );	
		
		ServicioPersonaNatural servicio = new  ServicioPersonaNatural();
		
		/*
		
		if(nombres.equals("") && dni.equals("")) {
			context.addMessage(null, new FacesMessage("Se debe de ingresar al menos un Valor",  "DNI o Nombres") );	
			
			
		} 
		else if (nombres != "" && dni != "") {
			context.addMessage(null, new FacesMessage("No puede ingresar dos valores a la vez en los campos",  "DNI o Nombres") );	
		}
		
		else if (nombres.equals("")) {
			listaPersonaNaturalBean.add(servicio.consultarPersonaNaturalNUNDOC(dni));
			context.addMessage(null, new FacesMessage("Se completo la búsqueda por",  "Numero de documento") );	
		}
		
		else  {
			listaPersonaNaturalBean=servicio.consultarpersonanaturalnombres(nombres);
			context.addMessage(null, new FacesMessage("Se completo la búsqueda por",  "Nombres y Apellidos") );	
		}
		
		*/
		
		if(nombres.equals("") && dni != "") {
			listaPersonaNaturalBean.add(servicio.consultarPersonaNaturalNUNDOC(dni));
			context.addMessage(null, new FacesMessage("Se completo la búsqueda por",  "Numero de documento") );	
		}else if (dni.equals("") && nombres!= "" ) {
			listaPersonaNaturalBean=servicio.consultarpersonanaturalnombres(nombres);
			context.addMessage(null, new FacesMessage("Se completo la búsqueda por",  "Nombres y Apellidos") );	
		}

			
		
	}
	
	public void buscarPersonaNaturalID(ActionEvent e) {
		
		ServicioPersonaNatural servicio = new ServicioPersonaNatural();
		
		String idclientepropuestosnatural =e.getComponent().getAttributes().get("idclientepropuestosnatural").toString();
		
		objPersonaNaturalBean=servicio.consultarPersonaNaturalID(Integer.parseInt(idclientepropuestosnatural));
		
		System.out.println("El ID a Consultar : " + idclientepropuestosnatural);
		
	}

}
