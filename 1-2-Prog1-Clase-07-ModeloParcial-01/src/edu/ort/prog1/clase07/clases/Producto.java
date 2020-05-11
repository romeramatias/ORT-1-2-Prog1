package edu.ort.prog1.clase07.clases;

public abstract class Producto {

	// cada producto debe calcular su descuento
	private String nombre;
	private double precio;

	// Para hacer uso del polimorfismo metodo getDescuento()
	public abstract double getDescuento();

	//

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
