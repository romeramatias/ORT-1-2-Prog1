/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

public class EmpleadoDespachante extends Empleado{

	private static final double PORC_ANTIG = 1.0;
	private boolean afiliado;
	private int nroAfiliado;
		
	@Override
	public double getPlus() {
		double porcPlus = calcularAntiguedad() * PORC_ANTIG;
		return porcPlus;	
	}


	private int calcularAntiguedad() {
		return 2020 - super.getAnioIngreso();
	}


	public boolean isAfiliado() {
		return afiliado;
	}


	public void setAfiliado(boolean afiliado) {
		this.afiliado = afiliado;
	}


	public int getNroAfiliado() {
		return nroAfiliado;
	}


	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}
	
	
	
	
}
