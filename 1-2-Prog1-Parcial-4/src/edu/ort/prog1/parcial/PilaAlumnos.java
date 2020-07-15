package edu.ort.prog1.parcial;

import java.util.ArrayList;

public class PilaAlumnos {

	private ArrayList<Alumno> alumnos;
	private static final int SIN_LIMITE = -1;
	private int limite;

	
	public PilaAlumnos(int limite) {
		super();
		this.alumnos = new ArrayList<Alumno>();
		this.limite = limite;
	}
	
	public PilaAlumnos() {
		this(SIN_LIMITE);
	}
	
	public void push(Alumno a) {
		if (!isFull()) {
			this.alumnos.add(a);
		}
	}
	
	public Alumno pop() {
		Alumno a = null;
		
		if (!isEmpty()) {
			a = this.alumnos.remove(this.alumnos.size()-1);
		}
		return a;
	}
	
	public Alumno peek() {
		Alumno a = null;
		
		if (!isEmpty()) {
			a = this.alumnos.get(this.alumnos.size()-1);
		}
		
		return a;
		
	}
	
	public boolean isEmpty() {
		// Llamo al metodo isEmpty de ArrayList
		// Y si es array como hago?
		return this.alumnos.isEmpty();
	}
	
	
	public boolean isFull() {
		boolean retorno = false;
		
		if (this.alumnos.size() == this.limite) {
			retorno = true;
		}
		
		return retorno;
	}

	public ArrayList<Alumno> getReclamos() {
		return alumnos;
	}

	public void setFacturas(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getSIN_LIMITE() {
		return SIN_LIMITE;
	}
	
	
	
}