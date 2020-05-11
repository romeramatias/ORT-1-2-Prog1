package edu.ort.prog1.clase04;

import edu.ort.prog1.clase04.clases.Gato;
import edu.ort.prog1.clase04.clases.Loro;
import edu.ort.prog1.clase04.clases.Perro;
import edu.ort.prog1.clase04.clases.Veterinaria;

public class Test {

	public static void main(String[] args) {

		// Creo un objeto de tipo Veterinaria
		Veterinaria veterinaria = new Veterinaria();
		
		// Creo algunas mascotas de distintos tipos
		Perro perro1 = new Perro("Tobi", 7, 15, "Beagle");
		Gato gato1 = new Gato("Michi", 5, 6, "Negro");
		Perro perro2 = new Perro("Nowak", 4, 25, "Bulldog");
		Loro loro1 = new Loro("Perico", 1, 2, 9);
		Gato gato2 = new Gato("Gaturro", 3, 2, "Blanco");
		
		// Agrego las mascotas al ArrayList de mascotas de Veterinaria
		veterinaria.agregarMascota(perro1);
		veterinaria.agregarMascota(gato1);
		veterinaria.agregarMascota(perro2);
		veterinaria.agregarMascota(loro1);
		veterinaria.agregarMascota(gato2);

		// Muestro Veterinaria
		System.out.println(veterinaria);
		
		// Hacer gracias de las mascotas de la veterinaria
		veterinaria.mascotasGracia();
	
		
	}

}
