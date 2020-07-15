/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Alumno {


	private final static double MONTO_FIJO = 12000;
	private String nombre;
	private String dni;
	private String nombreCurso;
	

	public Alumno(String nombre) {
		this.nombre = nombre;
	}


	public Alumno(String nombre, String dni, String nombreCurso) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nombreCurso = nombreCurso;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombreCurso() {
		return nombreCurso;
	}


	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	public static double getMontoFijo() {
		return MONTO_FIJO;
	}


	public double calcularCuota() {
		return MONTO_FIJO - getDescuento();
	}
	
	public double getDescuento() {
		return 0;
	}
}
