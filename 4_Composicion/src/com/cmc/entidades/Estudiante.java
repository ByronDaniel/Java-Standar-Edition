package com.cmc.entidades;

public class Estudiante {
	private String cedula;
	private String nombre;
	private Direccion direccion;

	public Estudiante(String cedula, String nombre) {
		// super();
		this.cedula = cedula;
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		if(direccion!=null){
			
		System.out.println("cedula: " + cedula + ", nombre: " + nombre + ", direccion: " + direccion.getCallePrincipal()
				+ " " + direccion.getCalleSecundaria() + " " + direccion.getNumero());
		}else{
			System.out.println("cedula: " + cedula + ", nombre: " + nombre + ", direccion: no asignada");
		}
	}
}
