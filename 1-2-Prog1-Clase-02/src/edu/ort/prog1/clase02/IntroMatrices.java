package edu.ort.prog1.clase02;

public class IntroMatrices {

	public static void main(String[] args) {

		// Introduccion Matrices
		// Una matriz tiene un array dentro de otra array de algun tipo de dato
		// Se puede pensar que es como un cuadro con sus FILAS y COLUMNAS
		// Tambien pienso que se puede imaginar como el primer [] un contedor del siguiente []
		// Ejemplo:
		String[][] personas = new String[3][4];
		// String personas es 3 contenedores de 4 personas cada uno, un total de 12 personas
		// O personas es un cuadro con 3 filas y 4 columnas

		// Metodo para mostrar todos los valores de una matriz bidimensional
		for (int f = 0; f < personas.length; f++) {
			for (int c = 0; c < personas[f].length; c++) {
				System.out.print(personas[f][c] + " ");
				// System.out.println(f + " " + c);
			}
			System.out.println();
		}

		// Metodo for anidados de reloj
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				System.out.println(h + ":" + m);
			}
		}
		
	}

}
