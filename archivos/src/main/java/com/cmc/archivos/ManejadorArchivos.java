package com.cmc.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.entidades.Persona;
import com.cmc.excepciones.ToxicaException;

public class ManejadorArchivos {
	private String rutaArchivo;
	private Logger logger = LogManager.getLogger(ManejadorArchivos.class);
	
	public ManejadorArchivos(String rutaArchivo){
		this.rutaArchivo = rutaArchivo;
	}
	
	public ArrayList<Persona> leer()throws ToxicaException {
		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader fileReader = null;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String [] partes;
		Persona p;
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			String linea = "";

			while((linea = br.readLine())!= null){
				partes = linea.split(",");
				p = new Persona(partes[0],partes[1],partes[2]);
				personas.add(p);
			}
			
			
		} catch (FileNotFoundException e) {
			logger.error("Error al leer el archivo",e);
			throw new ToxicaException("No existe el archivo: "+rutaArchivo);
		} catch (IOException e) {
			logger.error("Error al leer el archivo",e);
			throw new ToxicaException("Error al leer el archivo"+rutaArchivo);

		} 	finally{
			try {
				if(br != null){
					br.close();					
				}
			} catch (IOException e) {
				logger.error("Error al cerrar el bufferReader",e);
			}finally{
				try {
					if(fileReader!=null){						
						fileReader.close();
					}
				} catch (IOException e) {
					logger.error("Error al cerrar el fileReader",e);

				}
			}
			
		}
		return personas;
	}
}
