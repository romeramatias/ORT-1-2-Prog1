package edu.ort.prog1.clase06.clases;

import edu.ort.prog1.clase06.Empresa;
import edu.ort.prog1.clase06.PalomaMensajera;
import edu.ort.prog1.clase06.TelefonoMovil;

public class Main06 {

	public static void main(String[] args) {

		// Creamos un objeto empresa de mensajeria
		Empresa e = new Empresa("FedEx");
		
		// Creamos objetos que son capaces de enviar mensajes
		// pero no tienen relacion entre si
		PalomaMensajera p1 = new PalomaMensajera("Pedro");
		PalomaMensajera p2 = new PalomaMensajera("Pepe");
		PalomaMensajera p3 = new PalomaMensajera("Pepe");
		PalomaMensajera p4 = new PalomaMensajera("Pepe");
		TelefonoMovil t1 = new TelefonoMovil("Samsung");
		TelefonoMovil t2 = new TelefonoMovil("Apple");
		TelefonoMovil t3 = new TelefonoMovil("Huawei");
		TelefonoMovil t4 = new TelefonoMovil("OnePlus");

		// Agregamos a la empresa los objetos que implementan EnviadorDeMensajes
		e.agregarMensajero(p1);
		e.agregarMensajero(p2);
		e.agregarMensajero(p3);
		e.agregarMensajero(p4);
		e.agregarMensajero(t1);
		e.agregarMensajero(t2);
		e.agregarMensajero(t3);
		e.agregarMensajero(t4);

		// Metodo para enviar un mensaje con todos los enviadores
		// Los mezclo primero para mostrar que no importa el orden
		e.mezclarMensajeros();
		e.enviarMensajes("Quedate en casa");
	
	
	}

}
