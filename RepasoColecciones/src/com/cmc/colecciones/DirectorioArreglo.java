package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo extends Directorio {
	Contacto[] contactos;
	int posicionContacto;
	public DirectorioArreglo(){
		contactos = new Contacto[6];
		posicionContacto = 0;
	}
	
	public void agregarContacto(Contacto contacto) {
		boolean existeContacto = false;
		for(Contacto contact:contactos){
			if(contact.getCedula().equals(contacto.getCedula())){
				existeContacto = true;
				break;
			}
		}
		if(!existeContacto){
			contactos[posicionContacto] = contacto;
			posicionContacto++;
		}
	}
	
	public Contacto buscarContacto(String cedula) {
		for(Contacto contact:contactos){
			if(contact.getCedula().equals(cedula)){
				return contact;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula) {
		for(Contacto contact:contactos){
			if(contact.getCedula().equals(cedula)){
				Contacto contactoEliminado = contact;
				contact = null;
				return contactoEliminado;
			}
		}
		return null;
	}

	public void imprimir() {
		for(Contacto contact:contactos){
			System.out.println(contact.toString());
		}
	}
}
