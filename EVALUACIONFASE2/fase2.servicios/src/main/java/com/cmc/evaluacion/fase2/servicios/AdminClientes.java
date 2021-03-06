package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.excepciones.CheckedException;
import com.cmc.excepciones.EvaluacionException;
//Checked - Exception > IOException
//Unchecked - RuntimeException 
public class AdminClientes {
	private static Logger logger = LogManager.getLogger(AdminClientes.class);
	
	public static Cartera armarCartera(String rutaArchivo){
		Cartera cartera = new Cartera();
		File file = new File(rutaArchivo);
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try{
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			String line = "";
			
				while((line = br.readLine()) != null){
					try{						
						armarCliente(line, cartera);
					}catch(ArrayIndexOutOfBoundsException e){
						logger.error("Error al armar cliente en la linea "+line+" "+e.getStackTrace());
					}
				}
	
		}catch(FileNotFoundException e){
			logger.error("Error al leer el archivo: ",e.getStackTrace());
			throw new EvaluacionException("Error al leer el archivo: "+rutaArchivo);
		}catch(IOException e){
			logger.error("Error al leer la linea", e.getStackTrace());
			throw new EvaluacionException("Error al leer la linea");
			
		}finally{
			try{
			br.close();
			}catch(IOException e){
				logger.error("No se pudo cerrar el bufferedReader", e.getStackTrace());
				throw new EvaluacionException("No se pudo cerrar el bufferedReader");
			}
			try{
				fileReader.close();
			}catch(IOException e){
				logger.error("No se pudo cerrar el fileReader", e.getStackTrace());

				throw new EvaluacionException("No se pudo cerrar el fileReader");

			}
		}
		return cartera;
	}
	private static void armarCliente(String linea, Cartera cartera){
		String [] partes;
		partes = linea.split(",");
		Cliente cliente = new Cliente(partes[0],partes[1],partes[2]);
		cartera.agregarCliente(cliente);
	}
}
