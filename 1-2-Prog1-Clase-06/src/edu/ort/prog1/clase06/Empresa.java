package edu.ort.prog1.clase06;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {

	private String razonSocial;
	// Se puede instanciar una interface sin importar que clase implementa esta interface
	// Ej, puedo tener enviadores de tipo Palomas y Telefonos
	private ArrayList<EnviadorDeMensajes> mensajeros;
	
	public Empresa(String razonSocial) {
		super();
		this.razonSocial = razonSocial;
		this.mensajeros = new ArrayList<>();
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Override
	public String toString() {
		return "Empresa [razonSocial=" + razonSocial + "]";
	}
	
	// Recibe una paloma o telefono pero hace un upcasting a EnviadorDeMensajesx
	public void agregarMensajero(EnviadorDeMensajes e) {
		// Validar?
		this.mensajeros.add(e);
	}
	
	public void enviarMensajes(String msj) {
		for (EnviadorDeMensajes e : this.mensajeros) {
			e.enviarMensaje(msj);
		}
	}
	
	public void mezclarMensajeros() {
		Collections.shuffle(mensajeros);
	}
	
	
}
