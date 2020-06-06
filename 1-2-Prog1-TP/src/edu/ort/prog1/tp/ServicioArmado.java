/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

public class ServicioArmado extends Servicio {

	private final static double PRECIO_HORA = 250;

	public ServicioArmado(int cantHoras) {
		super(cantHoras);
		super.setPrecio(calcularPrecio());
	}

	@Override
	public double calcularPrecio() {
		return getCantHoras() * PRECIO_HORA;
	}

	public static double getPrecioHora() {
		return PRECIO_HORA;
	}
	
	 
	
	
}
