package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
				
		Producto producto=new Producto("D324","Detergente",0.90);
		maquina.cargarProducto(producto, "B", 25);
		
		Producto producto2=new Producto("E234","Escoba",1.5);
		maquina.cargarProducto(producto2, "A", 15);
		
		maquina.vender("B");
		double cambio=maquina.venderConCambio("A",2.0);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);
		
	}

}
