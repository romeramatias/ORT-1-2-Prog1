/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

public abstract class Servicio implements Facturable{

	private int cantHoras;
	private double precioServicio;

	
	public Servicio(int cantHoras) {
		super();
		this.cantHoras = cantHoras;
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	public double getPrecio() {
		return precioServicio;
	}

	public void setPrecio(double precio) {
		this.precioServicio = precio;
	}

	public double facturar() {
		return Matematica.sumarPorcentaje(precioServicio, IVA/2);
	}
}
