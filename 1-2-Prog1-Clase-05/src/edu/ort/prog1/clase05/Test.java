package edu.ort.prog1.clase05;

import edu.ort.prog1.clase05.clases.EmpleadoComision;
import edu.ort.prog1.clase05.clases.EmpleadoFijo;
import edu.ort.prog1.clase05.clases.Empresa;

public class Test {
	
	public static void main(String[] args) {

		// Creamos un objeto tipo Empresa
		Empresa ypf = new Empresa("YPF");
		
		//1- Creamos objetos de empleados de ambos tipos
		EmpleadoFijo a = new EmpleadoFijo("Javier Gomez", "569587A", 2008, 13000);
		EmpleadoComision b = new EmpleadoComision("Eva Nieto", "695235B", 2010, 179, 80);
		EmpleadoComision c = new EmpleadoComision("Jos� Ruiz", "741258C", 2012, 81, 86);
		EmpleadoFijo d = new EmpleadoFijo("Mar�a N��ez", "896325D", 2013, 11500);
		
		
		//Agregamos los empleados a la Empresa
		ypf.agregarEmpleado(a);
		ypf.agregarEmpleado(b);
		ypf.agregarEmpleado(c);
		ypf.agregarEmpleado(d);

		//2- Mostrar en forma de tabla el nombre completo de cada empleado junto a su salario		
		ypf.mostrarSalarios();

		//3- Mostrar el monto total que abona la empresa en concepto de salarios.
		ypf.mostrarMontoTotalSalarios();
		
		//4- Mostrar el nombre completo del empleado con mayor sueldo b�sico.
		ypf.empleadoMejorSueldo();
		
		//5- Mostrar cu�ntos empleados a comisi�n hay.
		ypf.mostrarCantEmpleadosComision();
		
	}
}
