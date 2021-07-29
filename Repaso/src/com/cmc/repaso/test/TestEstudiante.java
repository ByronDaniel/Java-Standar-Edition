package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estud1 = new Estudiante("Daniel");
		estud1.calificar(10);
		//verificar que funciona con debugger
		System.out.println(estud1.getNombre()+" "+estud1.getNota()+" "+estud1.getResultado());
	
		Estudiante estud2 = new Estudiante("Wilmer");
		estud2.calificar(7);
		//verificar que funciona con debugger
		System.out.println(estud2.getNombre()+" "+estud2.getNota()+" "+estud2.getResultado());
	}

}
