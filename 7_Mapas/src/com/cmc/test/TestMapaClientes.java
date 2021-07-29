package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
		mapa.put("1751592013", new Cliente("1751592013", "Daniel"));
		mapa.put("1518587487", new Cliente("1518587487", "Erick"));

		Cliente cliente = mapa.get("1751592013");
		System.out.println(cliente);
	}

}
