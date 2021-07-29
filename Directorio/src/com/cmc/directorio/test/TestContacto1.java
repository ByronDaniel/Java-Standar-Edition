package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telef = new Telefono(12,"movi","0985645412");
		Contacto c = new Contacto("Daniel", "Delgado", telef, 250);
		System.out.println("Nombre: "+c.getNombre()+" "+c.getApellido()+", peso: "+c.getPeso()+", telefono: "+c.getTelefono().getOperadora()+" "+c.getTelefono().getNumero());
	}

}
