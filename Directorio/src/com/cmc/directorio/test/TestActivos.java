package com.cmc.directorio.test;


import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telf = new Telefono(21, "movi", "098541621");
		Contacto contactoNuevo = new Contacto("Elias", "Rodríguez", telf, 156);

		System.out.println("activo: "+contactoNuevo.isActivo()+", nombre: " + contactoNuevo.getNombre() + " " + contactoNuevo.getApellido() + ", peso: "
				+ contactoNuevo.getPeso() + ", telefono: " + contactoNuevo.getTelefono().getOperadora()
				+ " " +contactoNuevo.getTelefono().getNumero() + ", tiene whatsapp? "
				+ contactoNuevo.getTelefono().isTieneWathsapp());
		
		AdminContactos ac = new AdminContactos();
		
		//El contacto debe tener whatsapp para activarlo
		AdminTelefono at = new AdminTelefono();
		at.activarMensajeria(telf); //activa whatsapp si es movi
		ac.activarUsuario(contactoNuevo);
		
		System.out.println("activo: "+contactoNuevo.isActivo()+", nombre: " + contactoNuevo.getNombre() + " " + contactoNuevo.getApellido() + ", peso: "
				+ contactoNuevo.getPeso() + ", telefono: " + contactoNuevo.getTelefono().getOperadora()
				+ " " +contactoNuevo.getTelefono().getNumero() + ", tiene whatsapp? "
				+ contactoNuevo.getTelefono().isTieneWathsapp());
	}

}
