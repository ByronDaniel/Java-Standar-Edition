package com.cmc.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio6 {
	private static Logger logger = LogManager.getLogger(Ejercicio6.class);
	public static void main(String[] args) {	
		Cuenta c = new Cuenta();
		try{		
			String a = null;
			a.toString();
			c.depositar(-100);
			
		}catch(CheckedException ex){
		System.out.println("Error");
			logger.error("Error al depositar", ex);
		}catch(Exception ex){
			System.out.println("Sistema no disponible comuniquese con soporte");
			logger.error("Error no controlado al depositar", ex);

		}
	}
}
