package edu.ort.prog1.clase07.clases;

public class Chef extends EmpleadoCocina{

	private String titulo;
	
	//
	public Chef(String nombre, int numLegajo, String fechaIngreso, String titulo) {
		super(nombre, numLegajo, fechaIngreso);
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Chef [titulo=" + titulo + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
