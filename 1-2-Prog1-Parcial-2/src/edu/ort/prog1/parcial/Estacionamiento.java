/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public interface Estacionamiento {

	boolean estacionar(Vehiculo vehiculo);
	
	Vehiculo retirar(String patente);
	
	boolean hayLugar();
	
}
