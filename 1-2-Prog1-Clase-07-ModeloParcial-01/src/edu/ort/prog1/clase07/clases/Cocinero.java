package edu.ort.prog1.clase07.clases;

public class Cocinero extends EmpleadoCocina {

	private int aniosExp;

	//
	public Cocinero(String nombre, int numLegajo, String fechaIngreso, int aniosExp) {
		super(nombre, numLegajo, fechaIngreso);
		this.aniosExp = aniosExp;
	}

	@Override
	public String toString() {
		return "Cocinero [aniosExp=" + aniosExp + "]";
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	
}
