package edu.ort.prog1.clase07.clases;

import edu.ort.prog1.clase07.enums.EstadoMesa;

public class Mesa {

	private static final int MAX_PERSONAS = 10;
	
	private int numDeMesa;
	private int capacidad;
	private Enum<EstadoMesa> estado;
	
	
	public Mesa(int numDeMesa, int capacidad, Enum<EstadoMesa> estado) {
		super();
		this.numDeMesa = numDeMesa;
		this.capacidad = capacidad;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Mesa [numDeMesa=" + numDeMesa + ", capacidad=" + capacidad + ", estado=" + estado + "]";
	}
	public int getNumDeMesa() {
		return numDeMesa;
	}
	public void setNumDeMesa(int numDeMesa) {
		this.numDeMesa = numDeMesa;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Enum<EstadoMesa> getEstado() {
		return estado;
	}
	public void setEstado(Enum<EstadoMesa> estado) {
		this.estado = estado;
	}
	public static int getMaxPersonas() {
		return MAX_PERSONAS;
	}
	public void liberar() {
		this.setEstado(EstadoMesa.LIBRE);
	}
	
	
}
