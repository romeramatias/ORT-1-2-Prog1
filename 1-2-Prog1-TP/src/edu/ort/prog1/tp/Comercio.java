/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

import java.util.ArrayList;

public class Comercio {

	private String nombre;
	private ArrayList<Facturable> facturables;

	public Comercio(String nombre) {
		super();
		this.nombre = nombre;
		this.facturables = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Facturable> getFacturables() {
		return facturables;
	}

	public void setFacturables(ArrayList<Facturable> facturables) {
		this.facturables = facturables;
	}

	public double montoTotalFacturado() {
		double sum = 0;
		for (Facturable f : facturables) {
			sum += f.facturar();
		}
		return sum;
	}

	public int serviciosReparacionMasDificultadQue(int dif) {
		int cont = 0;
		ArrayList<ServicioReparacion> serviciosReparacion = buscarServiciosDeReparacion();

		for (ServicioReparacion s : serviciosReparacion) {
			if (s.getDificultad() > dif) {
				cont++;
			}
		}

		return cont;
	}

	private ArrayList<ServicioReparacion> buscarServiciosDeReparacion() {
		ArrayList<ServicioReparacion> serv = new ArrayList<>();

		for (Facturable f : facturables) {
			if (esServicioReparacion(f)) {
				serv.add((ServicioReparacion) f);
			}
		}

		return serv;
	}

	private boolean esServicioReparacion(Facturable fac) {
		return fac instanceof ServicioReparacion;
	}

	public void agregar(Facturable fac) {
		this.facturables.add(fac);
	}

}
