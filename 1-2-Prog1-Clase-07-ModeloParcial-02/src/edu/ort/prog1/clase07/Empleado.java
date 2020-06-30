/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

public abstract class Empleado {

	private static final double PLUS_SENIOR = 5000;
	private String nombre;
	private int legajo;
	private double sueldo;
	private int anioIngreso;
	private double plusSalarial;
	private TipoEmpleado tipo;

	public abstract double getPlus();

	public boolean esSenior() {
		boolean bool = false;
		
		if (getTipo() == TipoEmpleado.SENIOR) {
			bool = true;
		}
		
		return bool;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int fechaIngreso) {
		this.anioIngreso = fechaIngreso;
	}

	public double getPlusSalarial() {
		return plusSalarial;
	}

	public void setPlusSalarial(double plusSalarial) {
		this.plusSalarial = plusSalarial;
	}

	public TipoEmpleado getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
	}

	public static double getPlusSenior() {
		return PLUS_SENIOR;
	}

	
	
}
