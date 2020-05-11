package edu.ort.prog1.clase02.clases;

import java.text.DecimalFormat;

public class Comision {

	private String codigo;
	private Character[][] presentismo;
	private Alumno alumnos[];
	private final Double PORCENTAJE_RENDIR_FINAL = 75.0;

	public Comision() {
		this.presentismo = new Character[][] { { 'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P' },
											   { 'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P' },
											   { 'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
											   { 'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
											   { 'T', 'P', 'T', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A' },
											   { 'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P' },
											   { 'P', 'T', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A' },
											   { 'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A' },
											   { 'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'T', 'P', 'P', 'P' } };
		this.alumnos = new Alumno[9];
		this.alumnos[0] = new Alumno(0, 24, "Alberti");
		this.alumnos[1] = new Alumno(1, 34, "Azcuénaga");
		this.alumnos[2] = new Alumno(2, 44, "Belgrano");
		this.alumnos[3] = new Alumno(3, 37, "Castelli");
		this.alumnos[4] = new Alumno(4, 22, "Larrea");
		this.alumnos[5] = new Alumno(5, 32, "Matheu");
		this.alumnos[6] = new Alumno(6, 49, "Moreno");
		this.alumnos[7] = new Alumno(7, 26, "Paso");
		this.alumnos[8] = new Alumno(8, 19, "Saavedra");

	}

	public double promedioEdadAlumnosInhabilitados() {
		Integer cantAlumnos = this.presentismo.length, acumuladorEdad = 0, contadorAlumnos = 0;
		Double porcentajeAsistencia, promedio = 0.0;

		for (int a = 0; a < cantAlumnos; a++) {
			porcentajeAsistencia = calcularPorcentajeAsistencia(a);
			if (porcentajeAsistencia > PORCENTAJE_RENDIR_FINAL) {
				acumuladorEdad += this.alumnos[a].getEdad();
				contadorAlumnos++;
			}
		}
		if (contadorAlumnos > 0) {
			promedio = (double) (acumuladorEdad / contadorAlumnos);
		}

		return promedio;
	}

	public void mostrarAlumnosHabilitadosParaRendirFinal() {
		Integer cantAlumnos = this.presentismo.length;
		Double porcentajeAsistencia;

		for (int a = 0; a < cantAlumnos; a++) {
			porcentajeAsistencia = calcularPorcentajeAsistencia(a);
			if (porcentajeAsistencia >= PORCENTAJE_RENDIR_FINAL) {
				System.out.println(this.alumnos[a].getApellido() + " " + porcentajeAsistencia);
			}
		}
	}

	private Double calcularPorcentajeAsistencia(int numeroAlumno) {

		Double cantidadClases = (double) this.presentismo[numeroAlumno].length;
		Double acumulador = cantidadClases, porcentajeAsistencia;

		for (int c = 0; c < cantidadClases; c++) {
			switch (this.presentismo[numeroAlumno][c]) {
			case 'A':
				acumulador -= 1;
				break;
			case 'T':
				acumulador -= 0.5;
				break;
			}
		}

		porcentajeAsistencia = (acumulador / cantidadClases) * 100;

		return porcentajeAsistencia;
	}

	public Integer totalLlegadasTarde() {
		Integer cantTardes = 0, cantAlumnos = this.presentismo.length;

		for (int a = 0; a < cantAlumnos; a++) {
			for (int c = 0; c < this.presentismo[a].length; c++) {
				if (this.presentismo[a][c] == 'T') {
					cantTardes++;
				}
			}
		}

		return cantTardes;

	}

	// Hay que volver la cantidad de presentes a 0 antes de consultar una nueva clase
	// Y los valores de presentes, cantidad de alumnos y cantidad de clases deber ser tipo Double
	public void mostrarClasesConNivelDePresentismo() {
		Double cantAlumnos = (double) this.presentismo.length, 
			   cantClases = (double) this.presentismo[0].length,
			   presentes = 0.0,
			   porcentajePresentismo = 0.0;
		DecimalFormat df = new DecimalFormat("#.00");
		
		for (int c = 0; c < cantClases; c++) {
			for (int a = 0; a < cantAlumnos; a++) {
				char valor = this.presentismo[a][c];
				if (valor == 'P' || valor == 'T') {
					presentes++;
				}
			}
			porcentajePresentismo = (presentes / cantAlumnos) * 100 ;
			System.out.println("Clase " + (c + 1) + ": " + df.format(porcentajePresentismo) + "%");
			presentes = 0.0;
		}

	}

	public Integer cantidadDeClasesConAsistenciaPerfecta() {
		Integer cantClases = this.presentismo[0].length,
				cantPerfectas = 0;

		for (int c = 0; c < cantClases; c++) {
			if (this.esClaseConAsistenciaPerfecta(c)) {
				cantPerfectas++;
			}
		}

		return cantPerfectas;
	}

	private Boolean esClaseConAsistenciaPerfecta(int numeroClase) {
		Integer a = 0, cantAlumnos = this.presentismo.length;
		boolean esPerfecta = true;

		while (esPerfecta && a < cantAlumnos) {
			if (presentismo[a][numeroClase] == 'A') {
				esPerfecta = false;
			} else {
				a++;
			}

		}

		return esPerfecta;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Character[][] getPresentismo() {
		return presentismo;
	}

	public void setPresentismo(Character[][] presentismo) {
		this.presentismo = presentismo;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public Double getPORCENTAJE_RENDIR_FINAL() {
		return PORCENTAJE_RENDIR_FINAL;
	}

}
