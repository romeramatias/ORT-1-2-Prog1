package edu.ort.prog1.clase06;

public class PalomaMensajera extends Ave implements EnviadorDeMensajes{

	public PalomaMensajera(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviarMensaje(String msj) {
		System.out.print("Soy una paloma mensajera, me llamo " + super.getNombre() + " y este es el mensaje: ");
		System.out.println(msj);
	}

}
