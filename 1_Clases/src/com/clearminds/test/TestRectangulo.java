package com.clearminds.test;
import com.clearminds.conceptos.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rect1 = new Rectangulo();
		rect1.altura = 8;
		rect1.base = 14;
		rect1.perimetroRectangulo();
		System.out.println(rect1.area());
		
	}

}
