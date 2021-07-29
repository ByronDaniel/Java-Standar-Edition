package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		
		Producto producto=new Producto("R234","Helado de vainilla",0.35);
		maquina.cargarProducto(producto, "B", 5);
		
		Producto producto2=new Producto("G324","Helado gemelo",0.50);
		maquina.cargarProducto(producto2, "A", 10);
		maquina.vender("C");
		System.out.println("*********VENDER HELADO DE VAINILLA********");
		maquina.vender("A");
		System.out.println("*********VENDER HELADO GEMELO********");
		maquina.vender("B");
		System.out.println("*********PRODUCTOS VENDIDOS Y STOCK ACTUAL********");
		maquina.mostrarProductos();
	}

}
