package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class AdminPersona {
	private ArrayList<Persona> personas;
	
	public AdminPersona(){
		this.personas = new ArrayList<Persona>();
	}
	public void agregarPersona(Persona persona){
		personas.add(persona);
	}
	
	public void imprimir(){
		for(Persona per : personas){
			System.out.println(per.getNombre()+" "+per.getEdad());
		}
	}
	//retorna la persona si coicide, caso contrario retorna null
	public Persona buscar(String nombre){

		for(Persona per : personas){
			if(per.getNombre().equals(nombre)){
				return per;
			}
		}
		return null;
	}
	
	public Persona buscarEdad(int edad){
		for(Persona per : personas){
			if(per.getEdad() == edad){
				return per;
			}
		}
		return null;
	}
	public ArrayList<Persona> buscaMayores(int edad){
		ArrayList<Persona> personasMayores = new ArrayList<Persona>();
		for(Persona per : personas){
			if(per.getEdad()>edad){
				personasMayores.add(per);
			}
		}
		return personasMayores;
	}
	
}
