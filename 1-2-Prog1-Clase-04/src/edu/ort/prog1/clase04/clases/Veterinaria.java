package edu.ort.prog1.clase04.clases;

import java.util.ArrayList;

public class Veterinaria {

	private ArrayList<Mascota> mascotas;

	public void mascotasGracia() {
		for (Mascota mascota : mascotas) {
			mascota.hacerGracia();
		}
	}
	
	@Override
	public String toString() {
		return "Veterinaria [mascotas=" + mascotas + "]";
	}

	public Veterinaria() {
		super();
		this.mascotas = new ArrayList<>();
	}

	public void agregarMascota(Mascota m) {
		this.mascotas.add(m);
	}
	
	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	
}
