package com.clearminds.conceptos;

public class Rectangulo {
	public int base;
	public int altura;
	public void perimetroRectangulo(){
		int resultado = (base*2)+(altura * 2);
		System.out.println("el perimetro es "+resultado);
	}
	public int area(){
		int area = base * altura;
		return area;
	}
}
