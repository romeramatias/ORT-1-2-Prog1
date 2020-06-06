/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

public interface Facturable {

	final static double IVA = 21.0;
	
	double calcularPrecio();
	
	double facturar();
}
