package edu.ort.prog1.clase04.clases;

public class Gato extends Mascota {

	private String color;

	@Override
	public String toString() {
		return "Gato " + super.toString() + "[color=" + color + "]";
	}

	public Gato(String nombre, int edad, int peso, String color) {
		super(nombre, edad, peso);
		this.color = color;
	}

	@Override
	public void hacerGracia() {
		System.out.println("Miau");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
