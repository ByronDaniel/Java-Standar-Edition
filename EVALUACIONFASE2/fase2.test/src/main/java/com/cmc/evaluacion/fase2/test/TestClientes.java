package com.cmc.evaluacion.fase2.test;


import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.servicios.AdminClientes;

import junit.framework.TestCase;

public class TestClientes extends TestCase {
	private static final String ROOT="C:\\Users\\Byron Daniel\\Downloads\\EvaluacionFase2-20210729T071943Z-001\\EvaluacionFase2\\archivos";
	
	public void testLeer(){
		Cartera cartera=AdminClientes.armarCartera(ROOT+"\\Clientes1.txt");
		assertEquals(4,cartera.getClientes().size());
		assertEquals("Beatriz",cartera.getClientes().get(2).getNombre());
	}
}
