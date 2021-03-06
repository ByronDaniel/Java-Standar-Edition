package com.cmc.evaluacion.fase2.entidades;

import java.util.Date;

public class Prestamo {
	private String numeroPrestamo;
	private Date fecha;
	private double monto;
	private String cedulaCliente;
	private String tipo;
	
	public String getNumeroPrestamo() {
		return numeroPrestamo;
	}
	public void setNumeroPrestamo(String numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public Prestamo(String numeroPrestamo, String cedulaCliente) {
		super();
		this.numeroPrestamo = numeroPrestamo;
		this.cedulaCliente = cedulaCliente;
	}
	@Override
	public String toString() {
		return "Prestamo [numeroPrestamo=" + numeroPrestamo + ", fecha=" + fecha + ", monto=" + monto
				+ ", cedulaCliente=" + cedulaCliente + ", tipo=" + tipo + "]";
	}
	
	
}
