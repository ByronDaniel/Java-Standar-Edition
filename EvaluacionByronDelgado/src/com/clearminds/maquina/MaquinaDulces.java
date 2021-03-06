package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public MaquinaDulces() {
		this.celda1 = new Celda();
		this.celda2 = new Celda();
		this.celda3 = new Celda();
		this.celda4 = new Celda();
	}

	public void configurarMaquina(String celda1, String celda2, String celda3, String celda4) {
		this.celda1.setCodigo(celda1);
		this.celda2.setCodigo(celda2);
		this.celda3.setCodigo(celda3);
		this.celda4.setCodigo(celda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1:" + celda1.getCodigo());
		System.out.println("CELDA 1:" + celda2.getCodigo());
		System.out.println("CELDA 1:" + celda3.getCodigo());
		System.out.println("CELDA 1:" + celda4.getCodigo());
		System.out.println("Saldo actual de la maquina: " + saldo);
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda celda : celdas) {
			if (celda.getCodigo().equals(codigoCelda)) {
				return celda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidadItems);

	}

	public void mostrarProductos() {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda celda : celdas) {
			System.out.println("********* CELDA " + celda.getCodigo());
			System.out.println("Stock:" + celda.getStock());

			if (celda.getProducto() != null) {
				System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
				System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
				System.out.println("C?digo Producto:" + celda.getProducto().getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		}
		System.out.println("Saldo:" + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		if (celdaEncontrada != null) {
			return celdaEncontrada.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		return celdaEncontrada.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda celda : celdas) {
			if (celda.getProducto() != null) {
				if (celda.getProducto().getCodigo().equals(codigoProducto)) {
					return celda;
				}
			}
		}
		return null;

	}

	public void incrementarProductos(String codigoProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int stockActual = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stockActual + cantidadItems);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		double precioProducto = celdaEncontrada.getProducto().getPrecio();
		saldo += precioProducto;
		mostrarProductos();
	}

	public double venderConCambio(String codigoCelda, double valorIngresadoPorCliente) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		double precioProducto = celdaEncontrada.getProducto().getPrecio();
		saldo += precioProducto;
		if (valorIngresadoPorCliente > precioProducto) {
			double cambio = valorIngresadoPorCliente - precioProducto;
			return cambio;
		} else {
			System.out.println("No hay cambio");
			return 0.0;
		}
	}
}
