package com.cmc.test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.archivos.ManejadorArchivos;
import com.cmc.entidades.Persona;
import com.cmc.excepciones.ToxicaException;

public class TestManejador {
	private static Logger logger = LogManager.getLogger(TestManejador.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejadorArchivos ma = new ManejadorArchivos("C:\\Users\\Byron Daniel\\Documents\\ejemplo.txt");
		try {
			ArrayList<Persona> personas = ma.leer();
			for(Persona p : personas){
				System.out.println(p);
			}
		} catch (ToxicaException e) {
			logger.error("No existe el archivo",e);
			System.out.println(e.getMessage());
		}catch(Exception e){
			logger.error("El sistema está dormido",e);
			System.out.println("El sistema está dormido");
		}
	}

}
