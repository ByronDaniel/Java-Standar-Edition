package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Prestamo> prestamos;
	
	public Cliente(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		prestamos = new ArrayList<Prestamo>();
	}
	
	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public void agregarPrestamo(Prestamo prestamo){
		prestamos.add(prestamo);
	}
	
}
