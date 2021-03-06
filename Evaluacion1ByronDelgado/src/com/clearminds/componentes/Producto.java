package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;

	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	// PROBAR
	public void incrementarPrecio(int porcentajeIncremento) {
		if (porcentajeIncremento > 0) {
			double porcentaje = precio * ((double) porcentajeIncremento / 100);
			precio += porcentaje;
		} else {
			System.out.println("El porcentaje de descuento debe ser mayor a 0.");
		}
	}

	public void disminuirPrecio(double valorDescuento) {
		if (valorDescuento <= precio) {
			precio -= valorDescuento;
		} else {
			System.out.println("El valor de descuento es mayor al precio del producto");
		}
	}
}
