package edu.ort.prog1.clase01;

import edu.ort.prog1.clase01.clases.Club;
import edu.ort.prog1.clase01.clases.PiernaHabil;
import edu.ort.prog1.clase01.clases.Posicion;

public class Main01 {

	public static void main(String[] args) {
			
		Club RiverPlate = new Club("River Plate", 1901);
		
		RiverPlate.agregarJugador(23, 14, "Romera", true, PiernaHabil.DERECHA, Posicion.DEFENSOR, 0);
		RiverPlate.agregarJugador(20, 10, "Martinez", true, PiernaHabil.IZQUIERDA, Posicion.DELANTERO, 1);
		System.out.println(RiverPlate);
		
		RiverPlate.cambiarNumeroCamiseta(14, 10);
		
		System.out.println(RiverPlate);
		
		System.out.println(RiverPlate.listaJugadoresMayoresWhile(19));
	
		RiverPlate.MostarJugadoresSegunPosicionWhile(Posicion.ARQUERO);
	}

}
