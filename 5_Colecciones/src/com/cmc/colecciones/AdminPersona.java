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
		for(int i = 0; i<personas.size();i++){
			Persona per = personas.get(i);
			System.out.println(per.getNombre()+" "+per.getEdad());
		}
	}
	//retorna la persona si coicide, caso contrario retorna null
	public Persona buscar(String nombre){
		Persona per;
		for(int i = 0; i<personas.size();i++){
			per= personas.get(i);
			if(per.getNombre().equals(nombre)){
				return per;
			}
		}
		return null;
	}
	
	public Persona buscarEdad(int edad){
		Persona per;
		for(int i = 0; i<personas.size();i++){
			per= personas.get(i);
			if(per.getEdad() == edad){
				return per;
			}
		}
		return null;
	}
	public ArrayList<Persona> buscaMayores(int edad){
		ArrayList<Persona> personasMayores = new ArrayList<Persona>();
		Persona p;
		for(int i = 0; i<personas.size();i++){
			p = personas.get(i);
			if(p.getEdad()>edad){
				personasMayores.add(p);
			}
		}
		return personasMayores;
	}
	
}