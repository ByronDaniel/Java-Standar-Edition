package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		System.out.println("nombre: "+persona.getNombre());
		System.out.println("edad: "+persona.getEdad());
		System.out.println("direccion :"+persona.getDireccion());
		
		Direccion dir = persona.getDireccion();
		if(dir!=null){			
			System.out.println("Calle principal:" +dir.getCallePrincipal());
		}else{
			System.out.println("No hay una dirección asignada");
		}
	}

}
