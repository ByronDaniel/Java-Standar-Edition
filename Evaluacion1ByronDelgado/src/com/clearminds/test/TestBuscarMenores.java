package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		
		Producto producto=new Producto("R234","Helado de vainilla",0.35);
		maquina.cargarProducto(producto, "A", 5);
		
		Producto producto2=new Producto("G324","Helado gemelo",0.50);
		maquina.cargarProducto(producto2, "B", 10);
		
		Producto producto3=new Producto("G444","Helado Polito",0.25);
		maquina.cargarProducto(producto3, "C", 1);
		
		Producto producto4=new Producto("H324","Helado Sandwitch",0.75);
		maquina.cargarProducto(producto4, "D", 14);
		
		// Mostrar en consola los productos menores a 0.50
		ArrayList<Producto> productosMenores = maquina.buscarMenores(0.50);
		for(Producto o : productosMenores ){
			System.out.println(o.getNombre()+" Precio:"+o.getPrecio());
		}

	}

}
