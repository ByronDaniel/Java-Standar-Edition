package com.clearminds.test;
import com.clearminds.entidades.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		auto1 = new Auto();
		auto1.setMarca("FORD");
		auto1.setAnio(2020);
		auto1.setPrecio(20080);
		
		System.out.println("el auto es "+auto1.getMarca()+", del a�o "+auto1.getAnio()+" y cuesta "+auto1.getPrecio());
		
		Auto auto2 = new Auto("Chevrolet",1900);
		System.out.println(auto2.getMarca());
		System.out.println(auto2.getPrecio());

	}

}
