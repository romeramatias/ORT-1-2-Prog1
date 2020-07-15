/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

import java.util.ArrayList;

public class ColaAlumnos {

	private ArrayList<Alumno> alumnos;
	private int limite;
	private static final int SIN_LIMITE = -1;
	
	
	public ColaAlumnos(int limite) {
		super();
		this.alumnos = new ArrayList<Alumno>();
		this.limite = limite;
	}
	
	public ColaAlumnos() {
		this(SIN_LIMITE);	
	}
	
	public void add(Alumno a) {
		if (!isFull()) {
			this.alumnos.add(a);
		}
	}

	public Alumno remove() {
		Alumno a = null;
		if (!isEmpty()) {
			a = this.alumnos.remove(0);
		}
		return a;
	}
	
	public Alumno get() {
		Alumno a = null;
		if (!isEmpty()) {
			a = this.alumnos.get(0);
		}
		return a;
	}
	
	public boolean isFull() {
		return this.alumnos.size() == limite;
	}

	public boolean isEmpty() {
		return this.alumnos.isEmpty();
	}
	
	@Override
	public String toString() {
		return "ColaAlumnos [alumnos=" + alumnos + ", limite=" + limite + "]";
	}
	
	public ArrayList<Alumno> getVehiculos() {
		return alumnos;
	}
	
	public void setOperaciones(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
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
