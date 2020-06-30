/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

public abstract class Articulo {

	private String codigo;
	private String nombre;
	private double precio;
	private boolean esAptoCeliaco;
	
	public abstract double calcularDescuento();

	public double calcularPrecioFinal(boolean esCuarentena) {
		if (!esCuarentena) {
			return precio;
		} else {
			return this.precio - this.precio * (calcularDescuento() / 100);
		}	
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public boolean esAptoCeliaco() {
		return esAptoCeliaco;
	}

	public void setEsAptoCeliaco(boolean esAptoCeliaco) {
		this.esAptoCeliaco = esAptoCeliaco;
	}
	
	
	
}
