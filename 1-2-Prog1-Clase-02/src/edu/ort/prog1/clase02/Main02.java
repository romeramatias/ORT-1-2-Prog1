package edu.ort.prog1.clase02;

import edu.ort.prog1.clase02.clases.Comision;

public class Main02 {

	public static void main(String[] args) {
		
		
		Comision comision = new Comision();
		
		System.out.println("Promedio de edad de Alumnos Inhabilitados:");
		System.out.println(comision.promedioEdadAlumnosInhabilitados());
		System.out.println();
		
		System.out.println("Alumnos habilitados para rendir Examen Final:");
		comision.mostrarAlumnosHabilitadosParaRendirFinal();
		System.out.println();
		
		System.out.println("Total de llegadas tardes:");
		System.out.println(comision.totalLlegadasTarde());
		System.out.println();

		System.out.println("Porcentaje de nivel de presentismo de clases:");
		comision.mostrarClasesConNivelDePresentismo();
		System.out.println();
		
		System.out.println("Clases con nivel de asistencia perfecta:");
		System.out.println(comision.cantidadDeClasesConAsistenciaPerfecta());
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
