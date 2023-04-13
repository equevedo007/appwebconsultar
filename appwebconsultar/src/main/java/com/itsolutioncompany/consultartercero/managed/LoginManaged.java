package com.itsolutioncompany.consultartercero.managed;

import java.io.Serializable;


import javax.faces.bean.ManagedBean;
//Edinson Ismael Quevedo Holguin
@ManagedBean(name="login")
public class LoginManaged implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String clave;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String validarUsuario() throws Exception{
		
		
		String out="bienvenida";
		
	
		return out;
		
	} 
	

}
