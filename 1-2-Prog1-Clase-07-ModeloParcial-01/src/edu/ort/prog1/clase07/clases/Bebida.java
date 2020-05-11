package edu.ort.prog1.clase07.clases;

public class Bebida extends Producto {

	private final static double DESC_SIN_ALCOHOL = 0.10;
	private final static double DESC_CON_ALCOHOL = 0.03;
	
	private double tamanio;
	private boolean esAlcoholica;
	
	@Override
	public double getDescuento() {
		if (esAlcoholica) {
			return DESC_CON_ALCOHOL;
		} else {
			return DESC_SIN_ALCOHOL;
		}
	
	}
	
	//
	public Bebida(String nombre, double precio, double tamanio, boolean esAlcoholica) {
		super(nombre, precio);
		this.tamanio = tamanio;
		this.esAlcoholica = esAlcoholica;
	}
	@Override
	public String toString() {
		return "Bebida [tamanio=" + tamanio + ", esAlcoholica=" + esAlcoholica + "]";
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public boolean isEsAlcoholica() {
		return esAlcoholica;
	}
	public void setEsAlcoholica(boolean esAlcoholica) {
		this.esAlcoholica = esAlcoholica;
	}
	public static double getDescSinAlcohol() {
		return DESC_SIN_ALCOHOL;
	}
	public static double getDescConAlcohol() {
		return DESC_CON_ALCOHOL;
	}
	
	
	
}
