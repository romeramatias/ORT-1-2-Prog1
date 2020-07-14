/** @author romeramatias 
 */
package edu.ort.prog1.parcial;
import java.util.ArrayList;

public class PilaCartas {

	private ArrayList<Carta> cartas;
	private static final int SIN_LIMITE = -1;
	private int limite;

	
	public PilaCartas(int limite) {
		super();
		this.cartas = new ArrayList<Carta>();
		this.limite = limite;
	}
	
	public PilaCartas() {
		this(SIN_LIMITE);
	}
	
	public void push(Carta car) {
		if (!isFull()) {
			this.cartas.add(car);
		}
	}
	
	public Carta pop() {
		Carta car = null;
		
		if (!isEmpty()) {
			car = this.cartas.remove(this.cartas.size()-1);
		}
		return car;
	}
	
	public Carta peek() {
		Carta car = null;
		
		if (!isEmpty()) {
			car = this.cartas.get(this.cartas.size()-1);
		}
		
		return car;
		
	}
	
	public boolean isEmpty() {
		return this.cartas.isEmpty();
	}
	
	
	public boolean isFull() {
		boolean retorno = false;
		
		if (this.cartas.size() == this.limite) {
			retorno = true;
		}
		
		return retorno;
	}

	public ArrayList<Carta> getReclamos() {
		return cartas;
	}

	public void setFacturas(ArrayList<Carta> reclamos) {
		this.cartas = reclamos;
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

	@Override
	public String toString() {
		return "PilaCartas [cartas=" + cartas + ", limite=" + limite + "]\n";
	}

}
