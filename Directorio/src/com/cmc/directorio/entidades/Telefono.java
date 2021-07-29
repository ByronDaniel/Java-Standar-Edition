package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWathsapp;
	
	public Telefono(int codigo, String operadora, String numero){
		this.codigo = codigo;
		this.operadora = operadora;
		this.numero = numero;
		this.tieneWathsapp = false;
	}

	public String getOperadora() {
		return operadora;
	}

	public String getNumero() {
		return numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean isTieneWathsapp() {
		return tieneWathsapp;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTieneWathsapp(boolean tieneWathsapp) {
		this.tieneWathsapp = tieneWathsapp;
	}
	
	
}
