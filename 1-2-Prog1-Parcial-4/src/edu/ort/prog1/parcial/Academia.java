/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Academia {

	private ColaAlumnos colaDeAlumnosAInscribir;
	private Instructor[] instructores;
	private Curso[] cursos;
	
	private final int CANT_CURSOS = 14;
	private final int CANT_INSTR = 8;
	// INSCRIPTOS COLA
	// ASIGNADOS PILA
	
	
	public Academia() {
		super();
		this.colaDeAlumnosAInscribir = new ColaAlumnos();
		
		inicializarEstructuras();
	}
	
	private void inicializarEstructuras() {
		inicializarInstructores();
		inicializarCursos();
	}

	private void inicializarCursos() {
		this.cursos = new Curso[CANT_CURSOS];
		
		for (int i = 0; i < cursos.length; i++) {
			this.cursos[i] = new Curso();
		}
	}

	private void inicializarInstructores() {
		this.instructores = new Instructor[CANT_INSTR];
		
		for (int i = 0; i < instructores.length; i++) {
			this.instructores[i] = new Instructor(i, "Apellido");
		}
	}

	public int cantidadDeInscriptosACurso(String nombreCurso) {
		int cont = 0;		
		final String NOMBRE_CENTINELA = "-1";
		Alumno alumnoAux;		
		
		this.colaDeAlumnosAInscribir.add(new Alumno(NOMBRE_CENTINELA));
		alumnoAux = this.colaDeAlumnosAInscribir.remove();

		while (!alumnoAux.getNombre().equals(NOMBRE_CENTINELA)) {
			if (alumnoAux.getNombreCurso().equals(nombreCurso)) {
				cont ++;
			}
			this.colaDeAlumnosAInscribir.add(alumnoAux);
			alumnoAux = this.colaDeAlumnosAInscribir.remove();
		}
			
		return cont;
	}

	public double alumnosPromedioPorCurso() {
		int index = 0;
		int sumatoria = 0;
		
		while (index < this.cursos.length) {
			sumatoria += this.cursos[index].contarAlumnos();
			index++;
		}
		
		return sumatoria / this.cursos.length;
	}
	
	public double promedioDeAbono() {
		double sumatoria = 0;	
		int cantAlumnos = 0;
		final String NOMBRE_CENTINELA = "-1";
		Alumno alumnoAux;		
		
		this.colaDeAlumnosAInscribir.add(new Alumno(NOMBRE_CENTINELA));
		alumnoAux = this.colaDeAlumnosAInscribir.remove();

		while (!alumnoAux.getNombre().equals(NOMBRE_CENTINELA)) {
			sumatoria += alumnoAux.calcularCuota();
			cantAlumnos++;

			this.colaDeAlumnosAInscribir.add(alumnoAux);
			alumnoAux = this.colaDeAlumnosAInscribir.remove();
		}

		return sumatoria / cantAlumnos;
	}
	
	
	public Curso cursoConMasBecados() {
		Curso curso = null;
		int index = 0;
		int cantBecados = 0;
		
		while (index < this.cursos.length) {
			if (this.cursos[index].cantidadAlumnosBecados() > cantBecados) {
				curso = this.cursos[index];
			}
			index++;
		}
		return curso;
	}

	public ColaAlumnos getColaDeAlumnosAInscribir() {
		return colaDeAlumnosAInscribir;
	}

	public void setColaDeAlumnosAInscribir(ColaAlumnos colaDeAlumnosAInscribir) {
		this.colaDeAlumnosAInscribir = colaDeAlumnosAInscribir;
	}

	public Instructor[] getInstructores() {
		return instructores;
	}

	public void setInstructores(Instructor[] instructores) {
		this.instructores = instructores;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	
	
}
