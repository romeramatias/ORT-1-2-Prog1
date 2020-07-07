/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

import java.util.ArrayList;

public class ColaOperaciones{

	private ArrayList<Operacion> operaciones;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	public ColaOperaciones(int limite) {
		super();
		this.operaciones = new ArrayList<Operacion>();
		this.limite = limite;
	}
	
	public ColaOperaciones() {
		this(SIN_LIMITE);	
	}
	
	public void add(Operacion o) {
		if (!isFull()) {
			this.operaciones.add(o);
		}
	}

	public Operacion remove() {
		Operacion o = null;
		if (!isEmpty()) {
			o = this.operaciones.remove(0);
		}
		return o;
	}
	
	public Operacion get() {
		Operacion o = null;
		if (!isEmpty()) {
			o = this.operaciones.get(0);
		}
		return o;
	}
	
	public boolean isFull() {
		return this.operaciones.size() == limite;
	}

	public boolean isEmpty() {
		return this.operaciones.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaOperaciones [operaciones=" + operaciones + ", limite=" + limite + "]";
	}
	
	public ArrayList<Operacion> getVehiculos() {
		return operaciones;
	}
	
	public void setOperaciones(ArrayList<Operacion> vehiculos) {
		this.operaciones = vehiculos;
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