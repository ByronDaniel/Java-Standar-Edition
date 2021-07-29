package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono){
		if(telefono.getOperadora()=="movi"){
			telefono.setTieneWathsapp(true);
		}
	}
	public int contarMovi(Telefono t1, Telefono t2, Telefono t3){
		Telefono [] telefonos = new Telefono [3];
		telefonos[0]=t1;
		telefonos[1]=t2;
		telefonos[2]=t3;
		int cantidadMovi = 0;
		for(int i = 0; i<telefonos.length;i++){
			if(telefonos[i].getOperadora()=="movi"){
				cantidadMovi++;
			}
		}
		return cantidadMovi;
	}
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4){
		Telefono [] telefonos = new Telefono [4];
		telefonos[0]=t1;
		telefonos[1]=t2;
		telefonos[2]=t3;
		telefonos[3]=t4;
		int cantidadClaro = 0;
		for(int i = 0; i<telefonos.length;i++){
			if(telefonos[i].getOperadora()=="claro"){
				cantidadClaro++;
			}
		}
		return cantidadClaro;
	}
	
}
