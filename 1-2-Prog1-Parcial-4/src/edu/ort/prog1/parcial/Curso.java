/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Curso {

	private String nombre;
	private Instructor instructor;
	private PilaAlumnos pilaDeAlumnos; // 20
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public PilaAlumnos getPilaDeAlumnos() {
		return pilaDeAlumnos;
	}
	public void setPilaDeAlumnos(PilaAlumnos pilaDeAlumnos) {
		this.pilaDeAlumnos = pilaDeAlumnos;
	}


	public int contarAlumnos() {
		int cantidad = 0;
		PilaAlumnos pilaAux = new PilaAlumnos();

		while (!this.pilaDeAlumnos.isEmpty()) {
			pilaAux.push(this.pilaDeAlumnos.pop());
			cantidad++;
		}

		pasarElementosDe(pilaAux, this.pilaDeAlumnos);
		
		return cantidad;
	}

	public int cantidadAlumnosBecados() {
		int cantidad = 0;
		PilaAlumnos pilaAux = new PilaAlumnos();
		Alumno alumno;

		while (!this.pilaDeAlumnos.isEmpty()) {
			alumno = this.pilaDeAlumnos.pop();
			if (alumno instanceof AlumnoBecado) {
				cantidad++;
			}
			pilaAux.push(alumno);
		}

		pasarElementosDe(pilaAux, this.pilaDeAlumnos);
		
		return cantidad;
	}
	
	private void pasarElementosDe(PilaAlumnos source, PilaAlumnos target) {

		while (!source.isEmpty()) {
			target.push(source.pop());
		}

	}
	
	
	
}
