package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo4 {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Jhon",22));
		personas.add(new Persona("María",15));
		Persona p = new Persona("Luis",15);
		personas.add(p);
		System.out.println(personas.size());
		
		for(Persona per : personas){
			System.out.println(per.getNombre()+" "+per.getEdad());
		}
		
	}
}
