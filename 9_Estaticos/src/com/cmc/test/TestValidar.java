package com.cmc.test;

import com.cmc.estaticos.Util;

public class TestValidar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util util = new Util();
		boolean resul = util.validarRango(5);
		System.out.println(resul);
		boolean positivo = util.validarPositivo(10);
		System.out.println(positivo);
		double numeroAleatorio = Math.random();
		System.out.println(numeroAleatorio);
		int numeroDeString = Integer.parseInt("35");
		System.out.println(numeroDeString);
	}

}
