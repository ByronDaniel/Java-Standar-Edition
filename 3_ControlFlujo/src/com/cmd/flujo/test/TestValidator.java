package com.cmd.flujo.test;

import com.cmc.flujo.Validator;

public class TestValidator {
	public static void main(String[]args){
		Validator validatorEdad = new Validator();
		System.out.println(validatorEdad.validarEdadTxt(18));
				
		//System.out.println(validatorEdad.validarEdadBool(18));
		//validatorEdad.validarEdad(19);
		
	}
}
