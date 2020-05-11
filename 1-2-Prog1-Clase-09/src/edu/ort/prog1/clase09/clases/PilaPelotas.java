package edu.ort.prog1.clase09.clases;

import java.util.ArrayList;

public class PilaPelotas {

	private ArrayList<Pelota> pelotas;
	private final int LIMITE = 5;

	public PilaPelotas() {
		super();
		this.pelotas = new ArrayList<Pelota>();
	}
	
	// Metodos de pila
	public void push(Pelota pel) {
		if (!isFull()) {
			this.pelotas.add(pel);
		}
	}
	
	public Pelota pop() {
		Pelota pel = null;
		
		if (!isEmpty()) {
			pel = this.pelotas.remove(this.pelotas.size()-1);
		}
		return pel;
	}
	
	public Pelota peek() {
		Pelota pel = null;
		
		if (!isEmpty()) {
			pel = this.pelotas.get(this.pelotas.size()-1);
		}
		
		return pel;
		
	}
	
	public boolean isEmpty() {
		// Llamo al metodo isEmpty de ArrayList
		// Y si es array como hago?
		return this.pelotas.isEmpty();
	}
	
	
	public boolean isFull() {
		boolean retorno = false;
		
		if (this.pelotas.size() == this.LIMITE) {
			retorno = true;
		}
		
		return retorno;
	}

	public ArrayList<Pelota> getPelotas() {
		return pelotas;
	}

	public void setPelotas(ArrayList<Pelota> pelotas) {
		this.pelotas = pelotas;
	}

	public int getLIMITE() {
		return LIMITE;
	}

	@Override
	public String toString() {
		return "PilaPelotas [pelotas=" + pelotas + ", LIMITE=" + LIMITE + "]";
	}

	
	
}
