/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Carta extends Tarjeta {

	private char letra;

	public Carta(String id, char letra) {
		super(id);
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public void mostrar() {
		System.out.println("Carta [letra=" + letra + "]");		
	}

	@Override
	public String toString() {
		return "Carta [letra=" + letra + "]";
	}

	
}
