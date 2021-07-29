package com.clearminds.test;
import com.clearminds.entidades.Persona;

/**
 * @author Byron Daniel
 *
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Daniel");
		System.out.println(p1.getNombre());
		
		p1.setEdad(22);
		System.out.println(p1.getEdad());
		
		p1.setEstatura(163);
		System.out.println(p1.getEstatura());
		
	}

}
