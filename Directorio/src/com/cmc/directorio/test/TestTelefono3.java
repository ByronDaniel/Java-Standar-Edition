package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel1 = new Telefono(1,"claro","098651122");
		Telefono tel2 = new Telefono(2,"claro", "098545445");
		Telefono tel3 = new Telefono(3,"movi","0985654145");
		AdminTelefono at = new AdminTelefono();
		int telefonosMovi = at.contarMovi(tel1, tel2, tel3);
		System.out.println("cantidad de telefonos movi: "+telefonosMovi);
		
	}

}
