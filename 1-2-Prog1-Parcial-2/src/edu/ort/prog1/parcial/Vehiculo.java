/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Vehiculo {

	private String patente;
	private String marca;
	private String modelo;
	
	public Vehiculo(String patente, String marca, String modelo) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
	}
	public Vehiculo(String patente) {
		super();
		this.patente = patente;
	}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
