/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

public class Paciente {

	private String nombre;
	private String dni;
	private char tipoPaciente;
	
	
	public Paciente(String nombre, String dni, char tipoPaciente) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.tipoPaciente = tipoPaciente;
	}
	
	public Paciente(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", dni=" + dni + ", tipoPaciente=" + tipoPaciente + "]";
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
	public char getTipoPaciente() {
		return tipoPaciente;
	}
	public void setTipoPaciente(char tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}
	
	
}
