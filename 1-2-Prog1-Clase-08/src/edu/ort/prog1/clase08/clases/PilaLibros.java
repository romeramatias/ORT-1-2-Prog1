package edu.ort.prog1.clase08.clases;

import java.util.ArrayList;

public class PilaLibros {

	private ArrayList<Libro> libros;
	private static final int SIN_LIMITE = -1;
	private int limite;

	// Sobrecarga de constructores por si creo una instancia de PilaLibros
	// sin enviar un limite(tope) de una pila
	public PilaLibros() {
		this(SIN_LIMITE);
	}

	public PilaLibros(int limite) {
		super();
		this.limite = limite;
		this.libros = new ArrayList<Libro>();
	}

	// Metodos de pilas
	public void push(Libro l) {
		if (!isFull()) {
			this.libros.add(l);
		}
	}
	
	public Libro pop() {
		Libro l = null;
		
		if (!isEmpty()) {
			l = this.libros.remove(this.libros.size()-1);
		}
		return l;
	}
	
	public Libro peek() {
		Libro l = null;
		
		if (!isEmpty()) {
			l = this.libros.get(this.libros.size()-1);
		}
		
		return l;
		
	}
	
	public boolean isEmpty() {
		// Llamo al metodo isEmpty de ArrayList
		// Y si es array como hago?
		return this.libros.isEmpty();
	}
	
	
	public boolean isFull() {
		boolean retorno = false;
		
		if (this.libros.size() == this.limite) {
			retorno = true;
		}
		
		return retorno;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
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

	@Override
	public String toString() {
		return "PilaLibros [libros=" + libros + ", limite=" + limite + "]";
	}
	
	
	
	
}
