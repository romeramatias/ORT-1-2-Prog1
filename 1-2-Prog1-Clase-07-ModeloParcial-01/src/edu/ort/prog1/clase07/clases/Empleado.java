package edu.ort.prog1.clase07.clases;

public class Empleado {

	private String nombre;
	private int numLegajo;
	private String fechaIngreso;
	
	
	//
	public Empleado(String nombre, int numLegajo, String fechaIngreso) {
		super();
		this.nombre = nombre;
		this.numLegajo = numLegajo;
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", numLegajo=" + numLegajo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumLegajo() {
		return numLegajo;
	}
	public void setNumLegajo(int numLegajo) {
		this.numLegajo = numLegajo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	
}
