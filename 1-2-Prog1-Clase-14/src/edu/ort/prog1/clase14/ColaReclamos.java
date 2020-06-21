/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

import java.util.ArrayList;

public class ColaReclamos {
	
	private ArrayList<Reclamo> reclamos;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	public ColaReclamos(int limite) {
		super();
		this.reclamos = new ArrayList<Reclamo>();
		this.limite = limite;
	}
	
	public ColaReclamos() {
		this(SIN_LIMITE);	
	}
	
	// Metodos de colas
	
	// Agrego si la cola no esta llena
	public void add(Reclamo r) {
		if (!isFull()) {
			this.reclamos.add(r);
		}
	}
	
	// Quito si no esta vacia y la retorno
	public Reclamo remove() {
		Reclamo r = null;
		if (!isEmpty()) {
			r = this.reclamos.remove(0);
		}
		return r;
	}
	
	// Get devuelve la primer persona que esta en la fila
	public Reclamo get() {
		Reclamo r = null;
		if (!isEmpty()) {
			r = this.reclamos.get(0);
		}
		return r;
	}
	
	// Preguntamos si el tamano del arraylist es igual que el limite
	// si lo es esta llena
	// en caso de que sea una cola sin limite el size nunca sera -1
	public boolean isFull() {
		return this.reclamos.size() == limite;
	}
	
	// Llamo al metodo isEmpty de arraylist
	public boolean isEmpty() {
		return this.reclamos.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaFacturas [reclamos=" + reclamos + ", limite=" + limite + "]";
	}

	public ArrayList<Reclamo> getReclamos() {
		return reclamos;
	}
	
	public void setPersonas(ArrayList<Reclamo> reclamos) {
		this.reclamos = reclamos;
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
