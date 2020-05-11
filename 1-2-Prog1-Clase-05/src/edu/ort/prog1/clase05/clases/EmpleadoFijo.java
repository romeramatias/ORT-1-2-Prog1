package edu.ort.prog1.clase05.clases;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado {

	private double sueldoBasico;
	private double salarioCalculado;
	

	@Override
	public String toString() {
		return super.toString() + "EmpleadoFijo [sueldoBasico=" + sueldoBasico + "]";
	}


	public EmpleadoFijo(String nombreApellido, String dni, int ingreso, double sueldoBasico) {
		super(nombreApellido, dni, ingreso);
		this.sueldoBasico = sueldoBasico;
		this.salarioCalculado = calcularSalario();
	}

	
	//Metodos
	
	@Override
	public double calcularSalario() {
		final int ANIO_ACTUAL = LocalDate.now().getYear();
		final double COMISION_1 = 0.5;
		final double COMISION_2 = 0.10;
		final double COMISION_3 = 0.15;
		final double COMISION_4 = 0.2;
		final int ANTIGUEDAD_1 = 2;
		final int ANTIGUEDAD_2 = 4;
		final int ANTIGUEDAD_3 = 8;
		final int ANTIGUEDAD_4 = 15;	
		
		double salario = sueldoBasico;
		int antiguedad = ANIO_ACTUAL - this.getIngreso();
		
		if (antiguedad > ANTIGUEDAD_4) {
			salario = salario + (salario * COMISION_4);
		} else if (antiguedad > ANTIGUEDAD_3) {
			salario = salario + (salario * COMISION_3);
		} else if (antiguedad > ANTIGUEDAD_2) {
			salario = salario + (salario * COMISION_2);
		} else if (antiguedad > ANTIGUEDAD_1){
			salario = salario + (salario * COMISION_1);
		}
		
		return salario;
	}
	
	
	
	
	public double getSalarioCalculado() {
		return salarioCalculado;
	}


	public void setSalarioCalculado(double salarioCalculado) {
		this.salarioCalculado = salarioCalculado;
	}


	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
}
