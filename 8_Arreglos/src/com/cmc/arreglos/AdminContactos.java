package com.cmc.arreglos;

import com.cmc.entidades.Contacto;

public class AdminContactos {
	private Contacto[] contactos;
	private int elementosAgregados;

	public AdminContactos(){
		contactos = new Contacto[10];
	}
		
	
	public Contacto[] getContactos() {
		return contactos;
	}


	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}


	public int getElementosAgregados() {
		return elementosAgregados;
	}


	public void setElementosAgregados(int elementosAgregados) {
		this.elementosAgregados = elementosAgregados;
	}


	public void agregar(Contacto contacto){
		if(elementosAgregados<contactos.length){			
			contactos[elementosAgregados] = contacto;
			elementosAgregados++;
		}
	}
	public Contacto mostrarInformacion(String codigo){
		for(Contacto contacto : contactos){
			if(contacto.getCodigo().equals(codigo)){
				return contacto;
			}
		}
		return null;
	}
	public void eliminar(String codigo){
		Contacto contacto;
		for(int i = 0; i<contactos.length; i++){
			contacto = contactos[i];
			if(contacto != null && contacto.getCodigo()!= null){	
				if( contacto.getCodigo().equals(codigo)){
					contactos[i] = null;
				}
			}
		}

	}
}
