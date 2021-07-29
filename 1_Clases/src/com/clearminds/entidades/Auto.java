package com.clearminds.entidades;
public class Auto {
	private String marca;
	private double precio;
	private int anio = 0;
	
	public Auto(){
		
	}
	public Auto(String marca, double precio){
		this.marca = marca;
		this.precio = precio;		
	}
	public Auto(String marca){
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}
