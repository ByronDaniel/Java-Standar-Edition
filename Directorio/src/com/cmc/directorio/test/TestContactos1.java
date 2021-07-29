package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono telf1 = new Telefono(21,"claro","098564541");
		Contacto contacto1 = new Contacto("Daniel","Delgado",telf1,160);
		//contacto2
		Telefono telf2 = new Telefono(25,"claro","0985645241");
		Contacto contacto2 = new Contacto("Melanie","Cordova",telf2,170);
		
		AdminContactos at = new AdminContactos();
		Contacto contactoMasPesado = at.buscarMasPesado(contacto1, contacto2);
		if(contactoMasPesado!=null){			
			System.out.println(contactoMasPesado.getNombre()+" "+contactoMasPesado.getApellido()+",peso: "+contactoMasPesado.getPeso()+",telefono: "+ contactoMasPesado.getTelefono().getOperadora()+" "+contactoMasPesado.getTelefono().getNumero());
		}else{
			System.out.println("Ambos contactos pesan igual");
		}
		
		boolean operadoraIgual = at.compararOperadoras(contacto1, contacto2);
		System.out.println(operadoraIgual);
		
	}

}
