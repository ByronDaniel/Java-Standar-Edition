package com.cms.test;

import java.util.ArrayList;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {
	public static void main(String[] args) {
		AdminPersona admin = new AdminPersona();
		admin.agregarPersona(new Persona("Malcom",10));
		admin.agregarPersona(new Persona("Laura",15));
		admin.imprimir();
		
		Persona p = admin.buscar("Malcom");
		if(p ==null){
			System.out.println("no existe");
		}else{			
			System.out.println("Encontrado:"+p.getNombre());
		}
		ArrayList<Persona> personas = admin.buscaMayores(11);
		System.out.println(personas.size());
	}
}
