package com.cmc.colecciones;

import java.util.ArrayList;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		String recuperado = lista.get(0);
		
		int tama�o = lista.size();
		System.out.println("tama�o del arreglo:"+tama�o);
		
		for(String cadena: lista){
			System.out.println("valor: "+cadena);
		}
	}

}
