/**
 * @author romeramatias
 */
package edu.ort.prog1.clase10.clases;

import java.util.ArrayList;

public class ColaPersonas {

	private ArrayList<Persona> personas;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	
	public ColaPersonas(int limite) {
		super();
		this.personas = new ArrayList<Persona>();
		this.limite = limite;
	}
	
	public ColaPersonas() {
		this(SIN_LIMITE);		
	}
	
	// Metodos de colas
	
	// Agrego si la cola no esta llena
	public void add(Persona p) {
		if (!isFull()) {
			this.personas.add(p);
		}
	}
	
	// Quito si no esta vacia y la retorno
	public Persona remove() {
		Persona p = null;
		if (!isEmpty()) {
			p = this.personas.remove(0);
		}
		return p;
	}
	
	// Get devuelve la primer persona que esta en la fila
	public Persona get() {
		Persona p = null;
		if (!isEmpty()) {
			p = this.personas.get(0);
		}
		return p;
	}
	
	// Preguntamos si el tamano del arraylist es igual que el limite
	// si lo es esta llena
	// en caso de que sea una cola sin limite el size nunca sera -1
	public boolean isFull() {
		return this.personas.size() == limite;
	}
	
	// Llamo al metodo isEmpty de arraylist
	public boolean isEmpty() {
		return this.personas.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaPersonas [personas=" + personas + ", limite=" + limite + "]";
	}
	
	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	
	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public static int getSinLimite() {
		return SIN_LIMITE;
	}
	
	
}
