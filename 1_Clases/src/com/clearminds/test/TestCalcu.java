package com.clearminds.test;
import com.clearminds.conceptos.Calculadora;

public class TestCalcu {

	public static void main(String[] args) {
	
		int resultado = 0;
		Calculadora c1 = new Calculadora();
		resultado = c1.sumar(3, 5);
		System.out.println("La suma es "+resultado);
		
		double resultadoResta = c1.restar(7.4, 5.3);
		System.out.println("La resta es "+resultadoResta);
		
		float resultadoMultiplicacion = c1.multiplicar(42, 3);
		System.out.println("la multiplicación es "+ resultadoMultiplicacion);
		
		int resultadoDivision = c1.dividirNumeros(10, 5);
		System.out.println(resultadoDivision);
		
		c1.imprimir();
	}

}
