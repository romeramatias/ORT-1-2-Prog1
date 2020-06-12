/**
 * @author romeramatias
 */
package edu.ort.prog1.clase12.clases;

public class Auto {

	private static String marca = "Peugeot";
	private String modelo;
	private String patente;
	
	public Auto(String modelo, String patente) {
		super();
		this.modelo = modelo;
		this.patente = patente;
	}


	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
	}

	
	
	
}
