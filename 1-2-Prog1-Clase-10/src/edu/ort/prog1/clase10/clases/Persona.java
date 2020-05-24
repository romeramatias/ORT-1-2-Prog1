/**
 * @author romeramatias
 */
package edu.ort.prog1.clase10.clases;

public class Persona {

	private String dni;

	public Persona(String dni) {
		super();
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
