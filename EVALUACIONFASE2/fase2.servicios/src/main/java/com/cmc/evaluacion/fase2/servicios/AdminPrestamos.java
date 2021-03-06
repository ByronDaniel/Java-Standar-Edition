package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.commons.util.DateUtil;
import com.cmc.commons.util.TipoPrestamo;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Prestamo;
import com.cmc.excepciones.EvaluacionException;

public class AdminPrestamos {
	private static Logger logger = LogManager.getLogger(AdminPrestamos.class);
	
	public static void colocarPrestamos(String rutaArchivo, Cartera cartera){

		File file = new File(rutaArchivo);
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			String line = "";
			while ((line = br.readLine()) != null){
				armarPrestamo(line,cartera);
			}
		} catch (FileNotFoundException e) {
			logger.error("No se pudo leer el archivo",e.getStackTrace());
			throw new EvaluacionException("No se pudo leer el archivo"+e.getMessage());
		} catch(IOException e){
			logger.error("No se pudo leer la linea"+e);
			throw new EvaluacionException("No se pudo leer la linea"+e.getMessage());
		}finally{
			try{
				if(fileReader != null){
					fileReader.close();
				}
			}catch(IOException e){
				logger.error("No se pudo cerrar el archivo",e.getStackTrace());
				throw new EvaluacionException("No se pudo cerrar el archivo"+e.getMessage());
			}
			try{
				if(br!= null){
					br.close();
				}
			}catch(IOException e){
				logger.error("No se pudo cerrar el archivo",e.getStackTrace());
				throw new EvaluacionException("No se pudo cerrar el archivo"+e.getMessage());
			}
		}
	}
	public static void armarPrestamo(String linea, Cartera cartera){
		
		String [] partes = linea.split("-");
		String cedulaCliente = partes[0];
		String numeroPrestamo = partes[1];
		String tipoPrestamo = numeroPrestamo.substring(0, 1);
		Double monto = Double.parseDouble(partes[3]);
		if(!(TipoPrestamo.HIPOTECARIO.equals(tipoPrestamo) || TipoPrestamo.QUIROGRAFARIO.equals(tipoPrestamo))) {
			tipoPrestamo = TipoPrestamo.OTRO;
		}
		try{			
			Date fecha = DateUtil.convertir(partes[2]);
			Prestamo prestamo = new Prestamo(numeroPrestamo,cedulaCliente);
			prestamo.setFecha(fecha);
			prestamo.setMonto(monto);
			prestamo.setTipo(tipoPrestamo);
			cartera.colocarPrestamo(prestamo);
		}catch(ParseException e){
			logger.error("No se pudo convertir la fecha");
			
		}
		
		
	}
	
}
