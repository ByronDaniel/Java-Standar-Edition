package com.cmc.flujo;

public class Validator {
	public void validarEdad(int edad){
		if(edad>18){
			System.out.println("Es mayor de edad");
		}else if(edad<18){
			System.out.println("Es menor de edad");
		}else{
			System.out.println("tiene 18");
		}
	}
	public String validarEdadTxt(int edad){
		if(edad>18){
			return "Es mayor de edad";
		}else if(edad==18){
			return "Tiene 18";
		}
		else{
			return "Es menor de edad";
		}
	}
	public boolean validarEdadBool(int edad){
		if(edad>=18){
			return true;
		}else{
			return false;
		}
	}
}
