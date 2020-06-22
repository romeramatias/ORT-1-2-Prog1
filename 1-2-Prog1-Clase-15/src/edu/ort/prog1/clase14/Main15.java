/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

public class Main15 {

	public static void main(String[] args) {
		
		// Creamos un hospital
		Hospital hospital = new Hospital(); 
		
		// Agrego pacientes a la cola de espera
		hospital.agregarPacientes(new Paciente("Carlos", "111", 'C'));		// 'C' Equipo 5 - Segundo
		hospital.agregarPacientes(new Paciente("Pedro", "111", 'U'));		// Equipo 1 - Primero
		hospital.agregarPacientes(new Paciente("Juan", "111", 'P'));		// Equipo 2 - Primero
		hospital.agregarPacientes(new Paciente("Alejandro", "111", 'C'));	// 'C' Equipo 1 - Tercero
		hospital.agregarPacientes(new Paciente("Matias", "111", 'C'));		// 'C' Equipo 2 - Tercero
		hospital.agregarPacientes(new Paciente("Ignacio", "111", 'U'));		// Equipo 3 - Primero
		hospital.agregarPacientes(new Paciente("Federico", "111", 'P'));	// Equipo 4 - Primero
		hospital.agregarPacientes(new Paciente("Nicolas", "111", 'P'));		// Equipo 5 - Primero
		hospital.agregarPacientes(new Paciente("Ezequiel", "111", 'P'));	// Equipo 1 - Segundo
		hospital.agregarPacientes(new Paciente("Ruben", "111", 'U'));		// Equipo 2 - Segundo
		hospital.agregarPacientes(new Paciente("Pablo", "111", 'U'));		// Equipo 3 - Segundo
		hospital.agregarPacientes(new Paciente("Jonathan", "111", 'C'));	// 'C' Equipo 3 - Tercero
		hospital.agregarPacientes(new Paciente("Fernando", "111", 'P'));	// Equipo 4 - Segundo
		
		// Asigno los pacientes a las colas de los equipos medicos
		hospital.asignarPacientes();
		
		// Muestro todas las colas de equipos medicos para comprobar el orden
		System.out.println(hospital.getEquiposMedicos()[0]);
		System.out.println(hospital.getEquiposMedicos()[1]);
		System.out.println(hospital.getEquiposMedicos()[2]);
		System.out.println(hospital.getEquiposMedicos()[3]);
		System.out.println(hospital.getEquiposMedicos()[4]);

		
		
	}

}
