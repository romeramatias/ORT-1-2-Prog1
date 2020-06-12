/**
 * @author romeramatias
 */
package edu.ort.prog1.clase12;

import edu.ort.prog1.clase12.clases.Auto;
import edu.ort.prog1.clase12.clases.ListaAutos;

public class Main12 {

	public static void main(String[] args) {
		// Clase 12, agregamos mas metodos a las listas
		
		
		// Creo una lista de autos
		ListaAutos listaAutosPeugeot = new ListaAutos();
		
		// Creo objetos de tipo auto
		Auto dosCinco = new Auto("205", "FFF111");
		Auto dosSeis = new Auto("206", "HHH222");
		Auto dosSiete = new Auto("207", "III333");
		Auto dosOcho = new Auto("208", "JJJ444");

//		// Agrego los Autos a la lista AL FINAL
//		listaAutosPeugeot.agregarAlFinal(dosCinco);
//		listaAutosPeugeot.agregarAlFinal(dosSeis);
//		listaAutosPeugeot.agregarAlFinal(dosSiete);
//		listaAutosPeugeot.agregarAlFinal(dosOcho);

		// Muestro la lista
		listaAutosPeugeot.mostrarTodo();
		System.out.println();
		
		// Ahora lo hago al reves, agregando los autos al principio
		listaAutosPeugeot.agregarAlPrincipio(dosOcho);
		listaAutosPeugeot.agregarAlPrincipio(dosSiete);
		listaAutosPeugeot.agregarAlPrincipio(dosSeis);
		listaAutosPeugeot.agregarAlPrincipio(dosCinco);
		
		// Muestro nuevamente la lista
		listaAutosPeugeot.mostrarTodo();
		System.out.println();
		
		// Metodo size
		System.out.println("La cantidad de elementos es de: " + listaAutosPeugeot.size());
		System.out.println();
		
		// Metodo get
		System.out.println(listaAutosPeugeot.get(2));
		System.out.println();
		
		// Metodo eliminar
		listaAutosPeugeot.eliminar("JJJ444");
	
		// Muestro nuevamente la lista
		listaAutosPeugeot.mostrarTodo();
		System.out.println();
	}

}
