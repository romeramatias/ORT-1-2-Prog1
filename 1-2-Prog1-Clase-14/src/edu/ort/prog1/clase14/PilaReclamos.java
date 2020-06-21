/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

import java.util.ArrayList;

public class PilaReclamos {

	private ArrayList<Reclamo> reclamos;
	private static final int SIN_LIMITE = -1;
	private int limite;

	
	public PilaReclamos(int limite) {
		super();
		this.reclamos = new ArrayList<Reclamo>();
		this.limite = limite;
	}
	
	public PilaReclamos() {
		this(SIN_LIMITE);
	}
	
	public void push(Reclamo rec) {
		if (!isFull()) {
			this.reclamos.add(rec);
		}
	}
	
	public Reclamo pop() {
		Reclamo rec = null;
		
		if (!isEmpty()) {
			rec = this.reclamos.remove(this.reclamos.size()-1);
		}
		return rec;
	}
	
	public Reclamo peek() {
		Reclamo rec = null;
		
		if (!isEmpty()) {
			rec = this.reclamos.get(this.reclamos.size()-1);
		}
		
		return rec;
		
	}
	
	public boolean isEmpty() {
		// Llamo al metodo isEmpty de ArrayList
		// Y si es array como hago?
		return this.reclamos.isEmpty();
	}
	
	
	public boolean isFull() {
		boolean retorno = false;
		
		if (this.reclamos.size() == this.limite) {
			retorno = true;
		}
		
		return retorno;
	}

	public ArrayList<Reclamo> getReclamos() {
		return reclamos;
	}

	public void setFacturas(ArrayList<Reclamo> reclamos) {
		this.reclamos = reclamos;
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
