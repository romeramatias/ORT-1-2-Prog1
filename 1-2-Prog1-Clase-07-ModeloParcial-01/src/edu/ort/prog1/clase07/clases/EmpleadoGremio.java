package edu.ort.prog1.clase07.clases;

public class EmpleadoGremio extends Empleado{

	private String horarioEntrada;
	private String horarioSalida;

	//
	public EmpleadoGremio(String nombre, int numLegajo, String fechaIngreso, String horarioEntrada,
			String horarioSalida) {
		super(nombre, numLegajo, fechaIngreso);
		this.horarioEntrada = horarioEntrada;
		this.horarioSalida = horarioSalida;
	}
	@Override
	public String toString() {
		return "EmpleadoGremio [horarioEntrada=" + horarioEntrada + ", horarioSalida=" + horarioSalida + "]";
	}
	public String getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	public String getHorarioSalida() {
		return horarioSalida;
	}
	public void setHorarioSalida(String horarioSalida) {
		this.horarioSalida = horarioSalida;
	}
	
}
