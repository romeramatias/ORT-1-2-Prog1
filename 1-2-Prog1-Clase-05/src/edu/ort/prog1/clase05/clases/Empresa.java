package edu.ort.prog1.clase05.clases;

import java.util.ArrayList;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Empleado> empleadosList;

	@Override
	public String toString() {
		return "Empresa [nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleadosList + "]";
	}

	public Empresa(String nombreEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.empleadosList = new ArrayList<>();
	}

	// Metodos
	public void agregarEmpleado(Empleado e) {
		// Habria que validar
		empleadosList.add(e);
	}

	public void mostrarSalarios() {
		System.out.println("EMPLEADO\tSALARIO");
		for (Empleado e : empleadosList) {
			System.out.print(e.getNombreApellido() + "\t");
			System.out.println(e.getSalarioCalculado());
		}

	}
	
	public void mostrarMontoTotalSalarios() {
		double acumulador = 0;
		
		for (Empleado e : empleadosList) {
			acumulador += e.getSalarioCalculado();
		}
		
		System.out.println("La empresa abona en total: $" + acumulador);
	}
	
	public void empleadoMejorSueldo(){
		double mejorPago = 0;
		String nombre = null;

		for (Empleado e : empleadosList) {
			// Desde la clase empleado deberia guardar el salario en una variable
			// Veo mucha repeticion del metodo calcularSalario()
			double salario = e.getSalarioCalculado();
			if (e.getSalarioCalculado() > mejorPago) {
				mejorPago = salario;
				nombre = e.getNombreApellido();
			}
		}
		
		System.out.println("El empleado con mayor sueldo básico es: " + nombre);
		
	}
	
	public void mostrarCantEmpleadosComision() {
		int contador = 0;
		for (Empleado e : empleadosList) {
			if(e instanceof EmpleadoComision) {
				contador++;
			}
		}
		System.out.println("Cantidad de empleados a comisión: " + contador);
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public ArrayList<Empleado> getEmpleadosList() {
		return empleadosList;
	}

	public void setEmpleadosList(ArrayList<Empleado> empleados) {
		this.empleadosList = empleados;
	}

}
