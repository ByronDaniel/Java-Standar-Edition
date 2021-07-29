package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item();
		System.out.println("**********VALORES INICIALES*********");
		item.imprimir();
		
		System.out.println("**********PRODUCTOS ACTUALES*********");
		item.setProductosActuales(20);
		item.imprimir();
		
		System.out.println("**********VENDER*********");
		item.vender(10);
		item.imprimir();
		
		System.out.println("**********ITEM 2*********");
		Item item2 = new Item();
		System.out.println("**********VALORES INICIALES*********");
		item2.imprimir();
		
		System.out.println("**********PRODUCTOS ACTUALES*********");
		item2.setProductosActuales(50);
		item2.imprimir();
		
		System.out.println("**********VENDER*********");
		item2.vender(5);
		item2.imprimir();
	}
	

}
