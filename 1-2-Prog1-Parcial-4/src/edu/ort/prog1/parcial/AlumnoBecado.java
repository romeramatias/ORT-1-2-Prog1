/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class AlumnoBecado extends Alumno{

	private double porcBeca;

	
	public AlumnoBecado(String nombre, String dni, String nombreCurso, double porcBeca) {
		super(nombre, dni, nombreCurso);
		this.porcBeca = porcBeca;
	}


	public double getDescuento() {
		return super.getMontoFijo() * porcBeca / 100;
	}


	public double getPorcBeca() {
		return porcBeca;
	}


	public void setPorcBeca(double porcBeca) {
		this.porcBeca = porcBeca;
	}
	
	
	
}
