package com.cmc.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("inicio");
		try{
			String a = null;
			a.substring(1,3);
		}catch(Exception error){
			System.out.println(error);
		}finally{
			System.out.println("siempre se ejecuta");
			//ejemplo se puede cerrar una conexión a una bd
		}
		System.out.println("fin");
	}

}
