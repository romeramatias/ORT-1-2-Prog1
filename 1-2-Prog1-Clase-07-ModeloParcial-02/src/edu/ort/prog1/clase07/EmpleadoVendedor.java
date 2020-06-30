/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

public class EmpleadoVendedor extends Empleado {

	private static final double PORC_PLUS_IDIOMAS = 7.0;
	private static final double PORC_PLUS = 5.0;

	private int cantIdiomas;

	@Override
	public double getPlus() {
		if (this.cantIdiomas > 1) {
			return PORC_PLUS_IDIOMAS;
		} else {
			return PORC_PLUS;
		}
	}

	public int getCantIdiomas() {
		return cantIdiomas;
	}

	public void setCantIdiomas(int cantIdiomas) {
		this.cantIdiomas = cantIdiomas;
	}

}
