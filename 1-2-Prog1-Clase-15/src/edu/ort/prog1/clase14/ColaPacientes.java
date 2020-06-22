/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

import java.util.ArrayList;

public class ColaPacientes {

	
	private ArrayList<Paciente> pacientes;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	public ColaPacientes(int limite) {
		super();
		this.pacientes = new ArrayList<Paciente>();
		this.limite = limite;
	}
	
	public ColaPacientes() {
		this(SIN_LIMITE);	
	}
	
	// Metodos de colas
	
	// Agrego si la cola no esta llena
	public void add(Paciente r) {
		if (!isFull()) {
			this.pacientes.add(r);
		}
	}
	
	// Quito si no esta vacia y la retorno
	public Paciente remove() {
		Paciente p = null;
		if (!isEmpty()) {
			p = this.pacientes.remove(0);
		}
		return p;
	}
	
	// Get devuelve la primer persona que esta en la fila
	public Paciente get() {
		Paciente p = null;
		if (!isEmpty()) {
			p = this.pacientes.get(0);
		}
		return p;
	}
	
	// Preguntamos si el tamano del arraylist es igual que el limite
	// si lo es esta llena
	// en caso de que sea una cola sin limite el size nunca sera -1
	public boolean isFull() {
		return this.pacientes.size() == limite;
	}
	
	// Llamo al metodo isEmpty de arraylist
	public boolean isEmpty() {
		return this.pacientes.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaFacturas [pacientes=" + pacientes + ", limite=" + limite + "]";
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}
	
	public void setPacientes(ArrayList<Paciente> reclamos) {
		this.pacientes = reclamos;
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
