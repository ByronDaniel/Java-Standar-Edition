package com.cmc.test;

import com.cmc.estaticos.DiasSemana;
// Importación de estático
import static java.lang.System.out;

public class TestDiasSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiasSemana ds = new DiasSemana();
		int valor = ds.MARTES;
		out.println(valor);
		
		int miercoles = DiasSemana.MIERCOLES;
		out.println(miercoles);
	}

}
