package edu.ort.prog1.clase04.clases;

public class Perro extends Mascota{

	private String raza;

	@Override
	public String toString() {
		return "Perro " + super.toString() + "[raza=" + raza + "]";
	}

	public Perro(String nombre, int edad, int peso, String raza) {
		super(nombre, edad, peso);
		this.raza = raza;
	}

	@Override
	public void hacerGracia() {
		System.out.println("Guau");		
	}
	
	
	
}
