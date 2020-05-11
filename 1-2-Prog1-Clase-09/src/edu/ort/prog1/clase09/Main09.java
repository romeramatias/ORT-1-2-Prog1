package edu.ort.prog1.clase09;

import edu.ort.prog1.clase09.clases.DeptoDeportes;
import edu.ort.prog1.clase09.clases.Pelota;
import edu.ort.prog1.clase09.clases.TipoPelota;

public class Main09 {

	public static void main(String[] args) {
				
		// Creo Departamento de Deportes con la cantidad de
		// 3 pilas de pelotas
		DeptoDeportes d = new DeptoDeportes(3);
		
		// Agregamos algunas pelotas para probar el metodo agregarPelota
		// y ver si impide agregar cuando las tres pilas esten llenas
		d.agregarPelota(new Pelota("545", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("126", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("123", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("140", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("788", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("852", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("671", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("901", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("333", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("690", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("532", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("876", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("423", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("766", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("112", TipoPelota.FUTBOL));
		// Llene las tres pilas y el siguiente no se puede agregar
		d.agregarPelota(new Pelota("111", TipoPelota.VOLEY));
		System.out.println();
		
		// Probamos el metodo de ver pelotas en el tope de cada pila
		d.verPelotasEnTope();
		System.out.println();

		// Metodo de buscar pelota por codigo
		System.out.println(d.buscarPelota("112"));
		System.out.println();
		
		// Uso de nuevo verPelotasEnTope para chequear que 
		// siguien igual de ordenadas las pilas
		d.verPelotasEnTope();

	}
}
