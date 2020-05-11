package edu.ort.prog1.clase07.clases;


import edu.ort.prog1.clase07.enums.CategoriaMozo;

public class Mozo extends EmpleadoGremio {

	private Enum<CategoriaMozo> categoria;

	
	
	public Mozo(String nombre, int numLegajo, String fechaIngreso, String horarioEntrada, String horarioSalida,
			Enum<CategoriaMozo> categoria) {
		super(nombre, numLegajo, fechaIngreso, horarioEntrada, horarioSalida);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Mozo [categoria=" + categoria + "]";
	}

	public Enum<CategoriaMozo> getCategoria() {
		return categoria;
	}

	public void setCategoria(Enum<CategoriaMozo> categoria) {
		this.categoria = categoria;
	}
	
	
}
