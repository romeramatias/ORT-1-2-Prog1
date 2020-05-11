package edu.ort.prog1.clase03.clases;

public class Chofer {

	private String id;
	private String nombre;
	private Double honorarios;
	
	public Chofer(String id, String nombre, Double honorarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.honorarios = honorarios;
	}
	
	@Override
	public String toString() {
		return "Chofer [id=" + id + ", nombre=" + nombre + ", honorarios=" + honorarios + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getHonorarios() {
		return honorarios;
	}
	public void setHonorarios(Double honorarios) {
		this.honorarios = honorarios;
	}
	
	
	
	
}
