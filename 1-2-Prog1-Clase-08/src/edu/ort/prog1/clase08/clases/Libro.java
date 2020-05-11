package edu.ort.prog1.clase08.clases;

public class Libro {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + "]";
	}

	public Libro(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
