package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		lista.add("xx");
		
		personas.add(new Persona("Ivan",19));
		
		String a = lista.get(0);
		Persona p = personas.get(0);
	}
}
