package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto("Maleta",40);
		System.out.println(producto.calcularPrecioPromo(50));
		
	}

}
