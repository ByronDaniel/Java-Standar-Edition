package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono(10, "movi", "09941234123");
		System.out.println("datos: operadora "+telf.getOperadora());
		System.out.println("numero: "+ telf.getNumero());
		System.out.println("codigo: "+ telf.getCodigo());
	}

}
