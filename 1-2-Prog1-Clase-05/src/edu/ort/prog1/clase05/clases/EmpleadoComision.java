package edu.ort.prog1.clase05.clases;

public class EmpleadoComision extends Empleado{

	private final double SALARIO_MINIMO = 10000;
	private int clientesCaptados;
	private double montoPorCliente;
	private double salarioCalculado;

	@Override
	public String toString() {
		return super.toString() + "EmpleadoComision [SALARIO_MINIMO=" + SALARIO_MINIMO + ", clientesCaptados=" + clientesCaptados
				+ ", montoPorCliente=" + montoPorCliente + "]";
	}

	public EmpleadoComision(String nombreApellido, String dni, int ingreso, int clientesCaptados,
			double montoPorCliente) {
		super(nombreApellido, dni, ingreso);
		this.clientesCaptados = clientesCaptados;
		this.montoPorCliente = montoPorCliente;
		this.salarioCalculado = calcularSalario();
	}

	//Metodos
	@Override
	public double calcularSalario() {
		
		double salario = clientesCaptados * montoPorCliente;
			
		if (salario > SALARIO_MINIMO) {
			return salario;
		} else {
		return SALARIO_MINIMO;
		}
	}

	public int getClientesCaptados() {
		return clientesCaptados;
	}

	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}

	public double getMontoPorCliente() {
		return montoPorCliente;
	}

	public void setMontoPorCliente(double montoPorCliente) {
		this.montoPorCliente = montoPorCliente;
	}

	public double getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}

	public double getSalarioCalculado() {
		return salarioCalculado;
	}

	public void setSalarioCalculado(double salarioCalculado) {
		this.salarioCalculado = salarioCalculado;
	}

	
	
}
