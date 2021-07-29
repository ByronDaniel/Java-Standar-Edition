package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante est = new Estudiante("174515660","Daniel");
		est.imprimir();
		//Direccion dir1 = new Direccion();
		//dir1.setCallePrincipal("av simon bolivar");
		//dir1.setCalleSecundaria("Calle 1");
		//dir1.setNumero("02102");
		//est.setDireccion(dir1);
		est.setDireccion(new Direccion("av Simon Bolivar","calle 1","234"));
		est.imprimir();
	}

}
