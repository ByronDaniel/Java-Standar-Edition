package com.cmc.test;

import java.util.HashMap;

public class TestMapas {
	public static void main(String[] args) {
		// Las claves son únicas

		HashMap<String, String> mapas = new HashMap<String, String>();
		mapas.put("a", "Mario");
		mapas.put("b", "Daniel");
		String resultado = mapas.get("a");
		System.out.println(resultado);
	}
}
