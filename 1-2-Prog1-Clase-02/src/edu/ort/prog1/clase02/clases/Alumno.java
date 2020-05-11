package edu.ort.prog1.clase02.clases;

public class Alumno {

	private Integer legajo;
	private Integer edad;
	private String apellido;

	
	public Alumno(Integer legajo, Integer edad, String apellido) {
		super();
		this.legajo = legajo;
		this.edad = edad;
		this.apellido = apellido;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
