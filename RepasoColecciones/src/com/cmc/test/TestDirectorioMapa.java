package com.cmc.test;

import com.cmc.colecciones.DirectorioLista;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestDirectorioMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectorioLista dl = new DirectorioLista();
		
		// Agregar Telefono
				Contacto contactoUno = new Contacto("1751592013", "Daniel", "Delgado");
				Telefono telefono = new Telefono("movi","0985350314");
				contactoUno.agregarTelefono(telefono);
				
		// Agregar contactos
		dl.agregarContacto(contactoUno);
		dl.agregarContacto(new Contacto("1234234234", "Edwin", "Guerrero"));
		dl.agregarContacto(new Contacto("1752314352", "Elias", "Medina"));
		dl.agregarContacto(new Contacto("1751523423", "Alex", "Landa"));
		dl.agregarContacto(new Contacto("1751234234", "Andres", "Carpio"));
		// No agrega contacto con cedula repetida
		dl.agregarContacto(new Contacto("1751234234", "AndresRepetido", "CarpioRepetido"));

		dl.imprimir();
		// Buscar contacto
		System.out.println("**********Buscar contacto con la cédula 1751592013 ");
		Contacto contactoEncontrado = dl.buscarContacto("1751592013");
		System.out.println(contactoEncontrado);
		
		// Eliminar contacto
		System.out.println("**********Eliminar contacto con la cédula 1234234234");
		Contacto contactoEliminado = dl.eliminarContacto("1234234234");
		System.out.println(contactoEliminado);
		System.out.println("**********Lista actualizada");
		
		// Imprimir
		dl.imprimir();
		

	}

}
