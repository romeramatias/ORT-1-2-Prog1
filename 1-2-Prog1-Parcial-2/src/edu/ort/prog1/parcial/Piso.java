/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Piso implements Estacionamiento{
	
	private ColaVehiculos colaDeVehiculos;

	public Piso(int cantVehiculos) {
		super();
		this.colaDeVehiculos = new ColaVehiculos(cantVehiculos);
	}

	@Override
	public boolean estacionar(Vehiculo vehiculo) {
		
		if (hayLugar()) {
			this.colaDeVehiculos.add(vehiculo);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public Vehiculo retirar(String patente) {
		final String PATENTE_CENTINELA = "-1";
		final int LIMITE_ORIGINAL = this.colaDeVehiculos.getLimite();
		Vehiculo vehiculoEncontrado = null;
		Vehiculo vehiculoAux;
		
		if (this.colaDeVehiculos.isFull()) {
			this.colaDeVehiculos.setLimite(LIMITE_ORIGINAL + 1);
		}
		
		
		this.colaDeVehiculos.add(new Vehiculo(PATENTE_CENTINELA));
		vehiculoAux = this.colaDeVehiculos.remove();

		while (!vehiculoAux.getPatente().equals(PATENTE_CENTINELA)) {
			if (vehiculoAux.getPatente().equals(patente)) {
				vehiculoEncontrado = vehiculoAux;
			} else {
				this.colaDeVehiculos.add(vehiculoAux);
			}
			vehiculoAux = this.colaDeVehiculos.remove();
		}
		
		this.colaDeVehiculos.setLimite(LIMITE_ORIGINAL);
		
		return vehiculoEncontrado;
	}

	@Override
	public boolean hayLugar() {
		return !this.colaDeVehiculos.isFull();
	}

	public ColaVehiculos getColaDeVehiculos() {
		return colaDeVehiculos;
	}

	public void setColaDeVehiculos(ColaVehiculos colaDeVehiculos) {
		this.colaDeVehiculos = colaDeVehiculos;
	}

	@Override
	public String toString() {
		return "Piso [colaDeVehiculos=" + colaDeVehiculos + "]";
	}
	
	
	
	
	
}
