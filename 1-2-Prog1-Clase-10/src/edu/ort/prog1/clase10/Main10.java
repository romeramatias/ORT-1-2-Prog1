/**
 * @author romeramatias
 */
package edu.ort.prog1.clase10;

import edu.ort.prog1.clase10.clases.Carniceria;
import edu.ort.prog1.clase10.clases.Persona;

public class Main10 {
	public static void main(String[] args) {
	
	// Creo una instancia de carniceria con un limite de 5 personas en la cola
	Carniceria carnDePedro = new Carniceria(5);
	
	// Agrego 4 personas a la cola
	carnDePedro.agregarPersonasALaCola(new Persona("123"));
	carnDePedro.agregarPersonasALaCola(new Persona("456"));
	carnDePedro.agregarPersonasALaCola(new Persona("789"));
	carnDePedro.agregarPersonasALaCola(new Persona("000"));
	
	// Muestro la carniceria con sus personas en la cola y su orden
	System.out.println(carnDePedro);
	System.out.println();
	
	// Cuento la cantidad de personas que hay en la cola con los dos metodos
	System.out.println(carnDePedro.contarPersonasColaCentinela());
	System.out.println(carnDePedro.contarPersonasColaConAux());
	System.out.println();
	
	// Pruebo el metodo de busqueda pasando un dni existente por paremetro
	System.out.println(carnDePedro.buscarPersonaPorDni("456"));
	System.out.println();
	
	// Imprimo nuevamente la carniceria 
	System.out.println(carnDePedro);
	System.out.println();
	
	
	}
}
