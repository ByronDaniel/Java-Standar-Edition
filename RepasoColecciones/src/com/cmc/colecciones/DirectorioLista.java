package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio{
	ArrayList<Contacto> contactos;
	public DirectorioLista(){
		contactos = new ArrayList<Contacto>();
	}
	
	public void agregarContacto(Contacto contacto) {
		boolean existeContacto = false;
		for(Contacto contactoRecorrido: contactos){
			if(contactoRecorrido.getCedula().equals(contacto.getCedula())){
				existeContacto = true;
				break;
			}
		}
		if(!existeContacto){
			contactos.add(contacto);			
		}
	}
	
	public Contacto buscarContacto(String cedula) {
		for(Contacto contacto: contactos){
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
