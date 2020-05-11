package edu.ort.prog1.clase05.clases;

public abstract class Empleado {

	// Abstract obliga a hacer Override a los metodos
	private String nombreApellido;
	private String dni;
	private int ingreso;
	private double salarioCalculado;
	
	@Override
	public String toString() {
		return "Empleado [nombreApellido=" + nombreApellido + ", dni=" + dni + ", ingreso=" + ingreso + "]";
	}

	public Empleado(String nombreApellido, String dni, int ingreso) {
		super();
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		this.ingreso = ingreso;
	}

	public abstract double calcularSalario();

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public double getSalarioCalculado() {
		return salarioCalculado;
	}

	public void setSalarioCalculado(double salarioCalculado) {
		this.salarioCalculado = salarioCalculado;
	}

	


}
