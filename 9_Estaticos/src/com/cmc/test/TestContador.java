package com.cmc.test;

import com.cmc.estaticos.Contador;

public class TestContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador contador = new Contador("contador");
		contador.incrementar();
		contador.imprimir();
		
		Contador c1 = new Contador("c1");
		c1.incrementar();
		c1.imprimir();
	}

}
