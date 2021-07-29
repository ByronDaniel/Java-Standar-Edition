package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminProducto adminProducto = new AdminProducto();
		Producto prod1 = new Producto("papas",0.55);
		Producto prod2 = new Producto("doritos",0.55);
		Producto prodCaro = adminProducto.obtenerProductoMasCaro(prod1, prod2);
		if(prodCaro!=null){
			System.out.println("el producto más caro es "+prodCaro.getNombre());
		}else{
			System.out.println("los precios son iguales");
		}
	}

}
