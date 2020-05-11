package edu.ort.prog1.clase03;

import edu.ort.prog1.clase03.clases.Empresa;

public class Main03 {

	public static void main(String[] args) {
		
		Empresa transportes = new Empresa();
		
		// Muestro el objeto Transportes con todos sus camiones y choferes harcodeados
		System.out.println(transportes);
		System.out.println();
		
		// Metodo que envia idCamion, idChofer, kmsViaje
		transportes.nuevoViaje(0, "14", 100.0);

		// Metodo de mostrar costos de todos los viajes
		// En este caso hay solo un viaje
		transportes.mostrarCostoViajes();
		System.out.println();
		
		// Metodo de mostar la matriz de cantidad de viajes
		// realizado por cada chofer en cada camion
		transportes.informarViajesChoferCamion();
		System.out.println();
	
		transportes.toString();
	}

}
