package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto contacto = new Contacto("1751592465","Daniel","Delgado");		
		//Agregar el telefono
		Telefono telf1 = new Telefono("movi","0985621345");
		contacto.agregarTelefono(telf1);
		//Sobrecarga
		System.out.println(contacto.toString());
	}

}
