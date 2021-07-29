package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel1 = new Telefono(1,"movi","0983322");
		Telefono tel2 = new Telefono(2,"claro", "09872425");
		Telefono tel3 = new Telefono(3,"movi","098562714");
		Telefono tel4 = new Telefono(4,"movi","098532145");

		AdminTelefono at = new AdminTelefono();
		System.out.println("cantidad de telefonos claro: "+at.contarClaro(tel1, tel2, tel3, tel4));
	}

}
