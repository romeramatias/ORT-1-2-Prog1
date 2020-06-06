/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

public class ServicioReparacion extends Servicio {

	private static final int MIN_DIF = 1;
	private static final int MAX_DIF = 5;
	private static final int MAYOR_DIF = 3;
	private static final double INCREMENTO_DIF = 25;
	private final static double PRECIO_HORA = 180;
	private int dificultad;

	@Override
	public double calcularPrecio() {
		double precioTotal = super.getCantHoras() * PRECIO_HORA;
		if (this.dificultad > MAYOR_DIF) {
			precioTotal = Matematica.sumarPorcentaje(precioTotal, INCREMENTO_DIF);
		}
		return precioTotal;
	}

	public int getDificultad() {
		return this.dificultad;
	}

	public void setDificultad(int dificultad) {
		if (dificultad <= MAX_DIF && dificultad >= MIN_DIF) {
			this.dificultad = dificultad;
		}
	}

	public ServicioReparacion(int cantHoras, int dificultad) {
		super(cantHoras);
		setDificultad(dificultad);
		super.setPrecio(calcularPrecio());
	}

	public static int getMinDif() {
		return MIN_DIF;
	}

	public static int getMaxDif() {
		return MAX_DIF;
	}

	public static double getIncrementoDif() {
		return INCREMENTO_DIF;
	}

	public static double getPrecioHora() {
		return PRECIO_HORA;
	}
	

}
