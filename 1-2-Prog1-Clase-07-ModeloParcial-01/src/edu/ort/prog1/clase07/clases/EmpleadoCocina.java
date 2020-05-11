package edu.ort.prog1.clase07.clases;

public class EmpleadoCocina extends Empleado{

	private static String nombreART = "Galeno ART";
	
	//
	public EmpleadoCocina(String nombre, int numLegajo, String fechaIngreso) {
		super(nombre, numLegajo, fechaIngreso);
		// TODO Auto-generated constructor stub
	}
	
	public static String getNombreART() {
		return nombreART;
	}

	public static void setNombreART(String nombreART) {
		EmpleadoCocina.nombreART = nombreART;
	}
	
	
}
