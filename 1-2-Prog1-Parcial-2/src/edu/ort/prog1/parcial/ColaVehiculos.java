/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

import java.util.ArrayList;

public class ColaVehiculos {

	private ArrayList<Vehiculo> vehiculos;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	public ColaVehiculos(int limite) {
		super();
		this.vehiculos = new ArrayList<Vehiculo>();
		this.limite = limite;
	}
	
	public ColaVehiculos() {
		this(SIN_LIMITE);	
	}
	
	public void add(Vehiculo v) {
		if (!isFull()) {
			this.vehiculos.add(v);
		}
	}

	public Vehiculo remove() {
		Vehiculo v = null;
		if (!isEmpty()) {
			v = this.vehiculos.remove(0);
		}
		return v;
	}
	
	public Vehiculo get() {
		Vehiculo v = null;
		if (!isEmpty()) {
			v = this.vehiculos.get(0);
		}
		return v;
	}
	
	public boolean isFull() {
		return this.vehiculos.size() == limite;
	}

	public boolean isEmpty() {
		return this.vehiculos.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaVehiculos [vehiculos=" + vehiculos + ", limite=" + limite + "]";
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	public void setPacientes(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
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
