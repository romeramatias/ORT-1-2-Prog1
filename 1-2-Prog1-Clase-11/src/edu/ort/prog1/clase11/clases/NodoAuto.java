/**
 * @author romeramatias
 */
package edu.ort.prog1.clase11.clases;

public class NodoAuto{

	private Auto dato;
	private NodoAuto next;
	
	
	public NodoAuto(Auto dato) {
		super();
		this.dato = dato;
	}

	public Auto getDato() {
		return dato;
	}

	public NodoAuto getNext() {
		return next;
	}

	public void setNext(NodoAuto next) {
		this.next = next;
	}

	public boolean hasNext() {
		return this.next != null;
	}
	
	
}
