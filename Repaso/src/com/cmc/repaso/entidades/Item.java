package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public int getProductosActuales() {
		return productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	
	public void setProductosActuales(int productosActuales){
		this.productosActuales = productosActuales;
	}
	
	public void imprimir(){
		System.out.println("Productos actuales: "+this.productosActuales);
		System.out.println("Productos devueltos: "+this.productosDevueltos);
		System.out.println("Productos vendidos: "+this.productosVendidos);
	}
	
	public void vender(int productosVendidos){
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;
	}
	
	public void devolver(int productosDevueltos){
		this.productosActuales += productosVendidos;
		this.productosVendidos -= productosVendidos;
		this.productosDevueltos += productosDevueltos;
	}
}
