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
		Contacto contactoRecorrido;
		for(int i = 0; i<contactos.length; i++){
			contactoRecorrido = contactos[i];
			if(contactoRecorrido.getCedula().equals(contacto.getCedula())){
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
		Contacto contacto;
		for(int i = 0; i<contactos.length;i++){
			contacto = contactos[i];
			if(contacto.getCedula().equals(cedula)){
				return contacto;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula) {
		Contacto contacto;
		for(int i = 0; i<contactos.length; i++){
			contacto = contactos[i];
			if(contacto.getCedula().equals(cedula)){
				Contacto contactoEliminado = contacto;
				contacto = null;
				return contactoEliminado;
			}
		}
		return null;
	}

	public void imprimir() {
		Contacto contacto;
		for(int i = 0; i<contactos.length;i++){
			contacto = contactos[i];
			System.out.println(contacto.toString());
		}
	}
}
