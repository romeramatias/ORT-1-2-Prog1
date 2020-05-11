package edu.ort.prog1.clase04.clases;

public class Loro extends Mascota{

	private int volumen;

	@Override
	public String toString() {
		return "Loro " + super.toString() + "[volumen=" + volumen + "]";
	}

	public Loro(String nombre, int edad, int peso, int volumen) {
		super(nombre, edad, peso);
		this.volumen = volumen;
	}

	@Override
	public void hacerGracia() {
		System.out.println("Prrrrrr");
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	
}
