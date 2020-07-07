/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Main {

	public static void main(String[] args) {
		
		// Instancio un objeto tipo juego, ya con sus cartas y operaciones inicializadas como en el enunciado
		// Muestro su estado inicial coincidente con el grafico
		Juego juego = new Juego();
		System.out.println(juego);
		System.out.println();
	
		// Proceso todas las operaciones del juego y muestro su nuevo estado, sin operaciones pendientes y
		// con el nuevo orden de los mazos
		juego.procesarOperaciones();
		System.out.println(juego);
		
		
	}

}
