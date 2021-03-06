package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(String codigoCelda) {
		Celda celda = new Celda(codigoCelda);
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (Celda celda : celdas) {
			System.out.println("CELDA:" + celda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
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
		for (Celda celda : celdas) {
			if (celda.getProducto() != null) {
				System.out.println("Celda:" + celda.getCodigo() + " Stock:" + celda.getStock() + " Producto:"
						+ celda.getProducto().getNombre() + " Precio:" + celda.getProducto().getPrecio());

			} else {
				System.out.println(
						"Celda:" + celda.getCodigo() + " Stock:" + celda.getStock() + " Sin Producto asignado");
			}
		}
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
		if (celdaEncontrada.getProducto() != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			double precioProducto = celdaEncontrada.getProducto().getPrecio();
			saldo += precioProducto;
			mostrarProductos();
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
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

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();
		for (Celda celda : celdas) {
			if (celda.getProducto() != null) {
				if (celda.getProducto().getPrecio() <= limite) {
					productosMenores.add(celda.getProducto());
				}
			}
		}
		return productosMenores;
	}
}
