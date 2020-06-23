/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

import java.util.Arrays;

public class Garage implements Estacionamiento {

	private final int CANT_PISOS = 5;
	private final int CANT_COCHERAS = 10;
	private Piso[] pisos;

	public Garage() {
		super();
		crearPisos();
	}

	private void crearPisos() {
		this.pisos = new Piso[CANT_PISOS];
		for (int i = 0; i < pisos.length; i++) {
			this.pisos[i] = new Piso(CANT_COCHERAS);
		}
	}

	// HAY QUE AVISAR
	@Override
	public boolean estacionar(Vehiculo vehiculo) {
		int index = 0;
		boolean estacionado = false;

		while (!estacionado && hayLugar()) {
			estacionado = this.pisos[index].estacionar(vehiculo);
			index++;
			}

		return estacionado;
	}

	// PROBAR SI DA INDEX OUT OF BOUND
	@Override
	public Vehiculo retirar(String patente) {
		Vehiculo vehiculoEncontrado = null;
		int index = 0;

		while (vehiculoEncontrado == null  && CANT_PISOS > index) {
			vehiculoEncontrado = this.pisos[index].retirar(patente);
			index++;
		}
		
		if (vehiculoEncontrado == null) {
			System.out.println("Vehiculo no encontrado");
		}
		
		return vehiculoEncontrado;
	}

	@Override
	public boolean hayLugar() {
		boolean hayLugar = false;
		int index = 0;
		
		while (!hayLugar & CANT_PISOS > index) {
			hayLugar = this.pisos[index].hayLugar();
			index++;
		}
		
		
		return hayLugar;
	}

	public Piso[] getPisos() {
		return pisos;
	}

	public void setPisos(Piso[] pisos) {
		this.pisos = pisos;
	}

	public int getCANT_PISOS() {
		return CANT_PISOS;
	}

	public int getCANT_COCHERAS() {
		return CANT_COCHERAS;
	}

	@Override
	public String toString() {
		return "Garage [CANT_PISOS=" + CANT_PISOS + ", CANT_COCHERAS=" + CANT_COCHERAS + ", pisos="
				+ Arrays.toString(pisos) + "]";
	}

}
