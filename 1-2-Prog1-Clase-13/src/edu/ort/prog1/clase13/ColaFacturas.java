package edu.ort.prog1.clase13;

import java.util.ArrayList;

public class ColaFacturas {

	private ArrayList<Factura> facturas;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	public ColaFacturas(int limite) {
		super();
		this.facturas = new ArrayList<Factura>();
		this.limite = limite;
	}
	
	public ColaFacturas() {
		this(SIN_LIMITE);	
	}
	
	// Metodos de colas
	
	// Agrego si la cola no esta llena
	public void add(Factura f) {
		if (!isFull()) {
			this.facturas.add(f);
		}
	}
	
	// Quito si no esta vacia y la retorno
	public Factura remove() {
		Factura f = null;
		if (!isEmpty()) {
			f = this.facturas.remove(0);
		}
		return f;
	}
	
	// Get devuelve la primer persona que esta en la fila
	public Factura get() {
		Factura p = null;
		if (!isEmpty()) {
			p = this.facturas.get(0);
		}
		return p;
	}
	
	// Preguntamos si el tamano del arraylist es igual que el limite
	// si lo es esta llena
	// en caso de que sea una cola sin limite el size nunca sera -1
	public boolean isFull() {
		return this.facturas.size() == limite;
	}
	
	// Llamo al metodo isEmpty de arraylist
	public boolean isEmpty() {
		return this.facturas.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaFacturas [facturas=" + facturas + ", limite=" + limite + "]";
	}

	public ArrayList<Factura> getPersonas() {
		return facturas;
	}
	
	public void setPersonas(ArrayList<Factura> personas) {
		this.facturas = personas;
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
