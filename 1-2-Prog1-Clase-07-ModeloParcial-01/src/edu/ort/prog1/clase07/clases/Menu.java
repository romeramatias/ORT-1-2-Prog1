package edu.ort.prog1.clase07.clases;

import java.util.ArrayList;

public class Menu {

	private String version;
	private ArrayList<Producto> productos;
	
	
	public Menu(String version) {
		super();
		this.version = version;
		this.productos = new ArrayList<>();
	}
	@Override
	public String toString() {
		return "Menu [version=" + version + ", productos=" + productos + "]";
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	
	
}
