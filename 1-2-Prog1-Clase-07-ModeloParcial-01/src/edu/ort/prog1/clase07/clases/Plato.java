package edu.ort.prog1.clase07.clases;

public class Plato extends Producto{

	private final static double DESC_PLATO = 0.05;
	private final static double DESC_CELIACO = 0.02;
	// Vegano no tiene descuento
	
	private String descripcion;
	private boolean esVegano;
	private boolean esAptoCeliaco;
	
	@Override
	public double getDescuento() {
		if (!esVegano) {
			if (esAptoCeliaco) {
				return DESC_CELIACO;
			} else {
				return DESC_PLATO;
			}
		}
		return 0;
	}
	
	
	public Plato(String nombre, double precio, String descripcion, boolean esVegano, boolean esAptoCeliaco) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.esVegano = esVegano;
		this.esAptoCeliaco = esAptoCeliaco;
	}


	@Override
	public String toString() {
		return "Plato [descripcion=" + descripcion + ", esVegano=" + esVegano + ", esAptoCeliaco=" + esAptoCeliaco
				+ "]";
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEsVegano() {
		return esVegano;
	}
	public void setEsVegano(boolean esVegano) {
		this.esVegano = esVegano;
	}
	public boolean isEsAptoCeliaco() {
		return esAptoCeliaco;
	}
	public void setEsAptoCeliaco(boolean esAptoCeliaco) {
		this.esAptoCeliaco = esAptoCeliaco;
	}
	public static double getDescPlato() {
		return DESC_PLATO;
	}
	public static double getDescCeliaco() {
		return DESC_CELIACO;
	}
	
	
}
