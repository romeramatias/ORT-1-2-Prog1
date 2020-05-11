package clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {

	Vehiculo[] camiones;
	Chofer[] choferes;
	ArrayList<Viaje> viajes;

	
	
	// Hardcodeando los datos segun enunciado
	public Empresa() {
		this.camiones = new Vehiculo[10];
		this.choferes = new Chofer[20];
		this.viajes = new ArrayList<>();

		// Hardcodeo 20 choferes y 10 camiones solo para probar la matriz
		this.choferes[0] = new Chofer("1", "Juan1", 100.0);
		this.choferes[1] = new Chofer("2", "Juan2", 200.0);
		this.choferes[2] = new Chofer("3", "Juan3", 300.0);
		this.choferes[3] = new Chofer("4", "Juan4", 400.0);
		this.choferes[4] = new Chofer("5", "Juan5", 500.0);
		this.choferes[5] = new Chofer("6", "Juan6", 600.0);
		this.choferes[6] = new Chofer("7", "Juan7", 700.0);
		this.choferes[7] = new Chofer("8", "Juan8", 800.0);
		this.choferes[8] = new Chofer("9", "Juan9", 900.0);
		this.choferes[9] = new Chofer("10", "Juan10", 1000.0);
		this.choferes[10] = new Chofer("11", "Juan11", 1100.0);
		this.choferes[11] = new Chofer("12", "Juan12", 1200.0);
		this.choferes[12] = new Chofer("13", "Juan13", 1300.0);
		this.choferes[13] = new Chofer("14", "Juan14", 1400.0);
		this.choferes[14] = new Chofer("15", "Juan15", 1500.0);
		this.choferes[15] = new Chofer("16", "Juan16", 1600.0);
		this.choferes[16] = new Chofer("17", "Juan17", 1700.0);
		this.choferes[17] = new Chofer("18", "Juan18", 1800.0);
		this.choferes[18] = new Chofer("19", "Juan19", 1900.0);
		this.choferes[19] = new Chofer("20", "Juan20", 2000.0);

		this.camiones[0] = new Vehiculo(0, 10.0);
		this.camiones[1] = new Vehiculo(1, 11.0);
		this.camiones[2] = new Vehiculo(2, 12.0);
		this.camiones[3] = new Vehiculo(3, 13.0);
		this.camiones[4] = new Vehiculo(4, 14.0);
		this.camiones[5] = new Vehiculo(5, 15.0);
		this.camiones[6] = new Vehiculo(6, 16.0);
		this.camiones[7] = new Vehiculo(7, 17.0);
		this.camiones[8] = new Vehiculo(8, 18.0);
		this.camiones[9] = new Vehiculo(9, 19.0);

	}

	@Override
	public String toString() {
		return "Empresa [camiones=" + Arrays.toString(camiones) + ", choferes=" + Arrays.toString(choferes)
			+ ", viajes=" + viajes + "]";
	}

	public void nuevoViaje(int idCamion, String idChofer, Double kmsViaje) {
		Viaje viaje = new Viaje(kmsViaje, idCamion, idChofer);
		this.viajes.add(viaje);
	}

	public void mostrarCostoViajes() {
		for (Viaje v : viajes) {
			Integer posicionChofer = posicionChofer(v.getIdChofer());
			if (posicionChofer != -1) {
				Double honorarios = this.choferes[posicionChofer].getHonorarios();
				Double gastoCamion = this.camiones[v.getIdCamion()].getGastoPromedioKm();
				Double kmsViaje = v.getKmsViaje();
				Double costo = (kmsViaje * gastoCamion) + honorarios;
				System.out.println("Costo de viaje $" + costo);
			} else {
				System.out.println("Chofer invalido");
			}

		}
	}

	private int posicionChofer(String idChofer) {
		int index = 0;
		Chofer cEncontrado = null;
		Chofer auxiliar;
		while (index < this.choferes.length && cEncontrado == null) {
			auxiliar = this.choferes[index];
			if (auxiliar != null && auxiliar.getId().equals(idChofer)) {
				cEncontrado = auxiliar;
			} else {
				index++;
			}

		}

		if (cEncontrado != null) {
			return index;
		} else {
			return -1;
		}
	}

	public void informarViajesChoferCamion() {
		int cantChoferes = this.choferes.length;
		int cantCamiones = this.camiones.length;
		int[][] cantViajesChoferCamion = new int[cantChoferes][cantCamiones];

		for (Viaje v : this.viajes) {
			int posicionChofer = posicionChofer(v.getIdChofer());
			if (posicionChofer != -1) {
				int numFila = posicionChofer(v.getIdChofer());
				int numCol = v.getIdCamion();
				cantViajesChoferCamion[numFila][numCol]++;
			}
		}
		mostrarMatriz2(cantViajesChoferCamion);

	}

	@SuppressWarnings("unused")
	private void mostrarMatriz(int[][] matriz) {

		for (int f = 0; f < matriz.length; f++) {
			System.out.println("- Chofer: " + this.choferes[f].getNombre());
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print("Camion ID: " + this.camiones[c].getId());
				System.out.println(" Viajes: " + matriz[f][c]);
			}

		}
	}

	// El que hizo Carlos
	private void mostrarMatriz2(int[][] matriz) {

		for (int f = 0; f < matriz.length; f++) {
			System.out.print("- Chofer: " + this.choferes[f].getNombre() + " ");
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}
}
