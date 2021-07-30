package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;
import java.util.HashMap;

public class Cartera {
	private ArrayList<Cliente> clientes;
	private HashMap<String,ArrayList<Pago>> pagos;
	public Cartera(){
		clientes = new ArrayList<Cliente>();
		pagos = new HashMap<String,ArrayList<Pago>>();
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public Cliente buscarCliente(String cedula){
		for(Cliente cliente : clientes){
			if(cliente.getCedula().equals(cedula)){
				return cliente;
			}
		}
		return null;
	}
	public boolean agregarCliente(Cliente cliente){
		Cliente clienteEncontrado = buscarCliente(cliente.getCedula());
		if(clienteEncontrado != null){
			return false;
		}else{
			clientes.add(cliente);
			return true;
		}
	}
	public void colocarPrestamo(Prestamo prestamo){
		for(Cliente cliente : clientes){
			if(prestamo.getCedulaCliente().equals(cliente.getCedula())){
				cliente.agregarPrestamo(prestamo);
			}
		}
	}
	public void agregarPago(Pago pago){
		
		if(!pagos.containsKey(pago.getNumeroPrestamo())){
			ArrayList<Pago> pagoLista = new ArrayList<Pago>();
			pagoLista.add(pago);
			pagos.put(pago.getNumeroPrestamo(), pagoLista);
		}else{
			ArrayList<Pago> pagoLista = pagos.get(pago.getNumeroPrestamo());
			pagoLista.add(pago);
		}
	}
	public ArrayList<Pago> consultarPagos(String codigoPrestamo){
		ArrayList<Pago> pagosRetorno = pagos.get(codigoPrestamo);
			if(pagosRetorno!=null){
				return pagosRetorno;
			}else{
				return new ArrayList<Pago>();
			}
	}
	public ArrayList<Balance> calcularBalances(){
		ArrayList<Balance> balances = new ArrayList<Balance>();
		for(Cliente cliente: clientes){
			Balance balance = new Balance();
			ArrayList<Prestamo> prestamos = cliente.getPrestamos();
			double valorPrestamos = 0;
			double valorPagado = 0;
			for(Prestamo prestamo : prestamos){
				valorPrestamos+=prestamo.getMonto();
				ArrayList<Pago> pagosPrestamo= pagos.get(prestamo.getNumeroPrestamo());
				if(pagosPrestamo!=null){
					for(Pago pago : pagosPrestamo){
						valorPagado += pago.getMonto();
					}
				}
			}
			double saldo = valorPrestamos-valorPagado;
			balance.setValorPrestamos(valorPrestamos);
			balance.setValorPagado(valorPagado);
			balance.setNumeroCedula(cliente.getCedula());
			balance.setSaldo(saldo);
			balances.add(balance);
		}
		return balances;
	}
}
