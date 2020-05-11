package edu.ort.prog1.clase04.clases;

public abstract class Mascota {

	private String nombre;
	private int edad;
	private int peso;
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	public Mascota(String nombre, int edad, int peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	public abstract void hacerGracia();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
