package edu.ort.prog1.clase06;

public class AparatoElectronico {
	
	private String marca;
	private boolean encendido;
	
	public AparatoElectronico(String marca) {
		super();
		this.marca = marca;
		this.encendido = true;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
}
