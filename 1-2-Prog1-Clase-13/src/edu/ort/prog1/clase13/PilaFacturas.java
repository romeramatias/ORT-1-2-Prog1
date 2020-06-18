package edu.ort.prog1.clase13;

import java.util.ArrayList;

public class PilaFacturas {

	private ArrayList<Factura> facturas;
	private static final int SIN_LIMITE = -1;
	private int limite;

	
	public PilaFacturas(int limite) {
		super();
		this.facturas = new ArrayList<Factura>();
		this.limite = limite;
	}
	
	public PilaFacturas() {
		this(SIN_LIMITE);
	}
	
	public void push(Factura fac) {
		if (!isFull()) {
			this.facturas.add(fac);
		}
	}
	
	public Factura pop() {
		Factura fac = null;
		
		if (!isEmpty()) {
			fac = this.facturas.remove(this.facturas.size()-1);
		}
		return fac;
	}
	
	public Factura peek() {
		Factura fac = null;
		
		if (!isEmpty()) {
			fac = this.facturas.get(this.facturas.size()-1);
		}
		
		return fac;
		
	}
	
	public boolean isEmpty() {
		// Llamo al metodo isEmpty de ArrayList
		// Y si es array como hago?
		return this.facturas.isEmpty();
	}
	
	
	public boolean isFull() {
		boolean retorno = false;
		
		if (this.facturas.size() == this.limite) {
			retorno = true;
		}
		
		return retorno;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
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
