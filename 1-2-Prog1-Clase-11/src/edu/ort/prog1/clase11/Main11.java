/**
 * @author romeramatias
 */
package edu.ort.prog1.clase11;

import edu.ort.prog1.clase11.clases.Auto;
import edu.ort.prog1.clase11.clases.ListaAutos;

public class Main11 {

	public static void main(String[] args) {

		// Creo una lista de autos
		ListaAutos listaAutosPeugeot = new ListaAutos();
		
		// Creo objetos de tipo auto
		Auto dosCinco = new Auto("205");
		Auto dosSeis = new Auto("206");
		Auto dosSiete = new Auto("207");
		Auto dosOcho = new Auto("208");

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
		System.out.println(listaAutosPeugeot.get(3));
		System.out.println();
		
		
	}

}
