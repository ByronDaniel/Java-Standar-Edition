package com.cmc.excepciones;

public class TestDeposito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		try {
			c.depositar(-100);
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
