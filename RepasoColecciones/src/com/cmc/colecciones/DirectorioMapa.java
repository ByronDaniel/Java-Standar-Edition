package com.cmc.colecciones;

import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioMapa extends Directorio{
	private HashMap<String, Contacto> contactos;

	public DirectorioMapa(){
		contactos = new HashMap<String, Contacto>();
	}
	
	public void agregarContacto(Contacto contacto) {
		boolean existeContacto = false;
		Contacto contactoRecorrido;
		for(int i = 0; i<contactos.size(); i++){
			contactoRecorrido = contactos.get(i);
			if(contactoRecorrido.getCedula().equals(contacto.getCedula())){
				existeContacto = true;
				break;
			}
		}
		if(!existeContacto){
			contactos.put(contacto.getCedula(), contacto);			
		}
	}
	
	public Contacto buscarContacto(String cedula) {
		Contacto contacto;
		for(int i = 0; i<contactos.size();i++){
			contacto = contactos.get(i);
			if(contacto.getCedula().equals(cedula)){
				return contacto;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula) {
		Contacto contacto;
		for(int i = 0; i<contactos.size(); i++){
			contacto = contactos.get(i);
			if(contacto.getCedula().equals(cedula)){
				Contacto contactoEliminado = contactos.remove(i);
				return contactoEliminado;
			}
		}
		return null;
	}

	public void imprimir() {
		Contacto contacto;
		for(int i = 0; i<contactos.size();i++){
			contacto = contactos.get(i);
			System.out.println(contacto.toString());
		}
	}


}
