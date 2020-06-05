/**
 * @author romeramatias
 */
package edu.ort.edu.prog1.clase11.clases;

public class Auto {

	private static String marca = "Peugeot";
	private String modelo;
	
	
	public Auto( String modelo) {
		super();
		this.modelo = modelo;
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


	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
	}

	
	
	
}
