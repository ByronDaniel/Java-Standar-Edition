package com.cmc.test;

import com.cmc.arreglos.AdminContactos;
import com.cmc.entidades.Contacto;

public class TestContactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto[] contactos = new Contacto[5];
		contactos[0] = new Contacto("123", "Daniel");
		contactos[1] = new Contacto("133", "Kevin");
		contactos[2] = new Contacto("143", "Edwin");
		contactos[3] = new Contacto("153", "Ramiro");
		contactos[4] = new Contacto("163", "Pa?l");
		
		
		
		
		AdminContactos ac = new AdminContactos();
		ac.agregar(new Contacto("123", "Daniel"));
		ac.agregar(new Contacto("133", "Kevin"));
		ac.agregar(new Contacto("163", "Pa?l"));
		

		
		int cantidadContactos = ac.getContactos().length;
		System.out.println(cantidadContactos);
		
		ac.eliminar("163");
		ac.eliminar("163");
		
		for(Contacto contacto1:ac.getContactos()){
			System.out.println(contacto1);
		}
	}

}
