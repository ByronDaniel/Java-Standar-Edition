package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.entidades.Estudiante;

public class AdminEstudiantes {
	private ArrayList<Estudiante> estudiantes;
	
	public void agregar(Estudiante estudiante){
		estudiantes.add(estudiante);
	}
	public Estudiante buscar(String cedula){

		// Enhanced for
		for(Estudiante est:estudiantes){
			if(est.getCedula().equals(cedula)){
				return est;	
			}
		}
		return null;
	}
	public ArrayList<Estudiante> buscarMenor(int edad){
		ArrayList<Estudiante> menores = new ArrayList<Estudiante>();
		for(Estudiante est : estudiantes){
			if(est.getEdad()<edad){
				menores.add(est);
			}
		}
		return menores;
	}
}
