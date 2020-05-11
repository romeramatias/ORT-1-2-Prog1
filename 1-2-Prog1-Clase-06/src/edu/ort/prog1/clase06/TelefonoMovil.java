package edu.ort.prog1.clase06;

public class TelefonoMovil extends AparatoElectronico implements EnviadorDeMensajes{

	public TelefonoMovil(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviarMensaje(String msj) {
		System.out.print("Soy un celular marca " + super.getMarca() + " y este es el mensaje: ");
		System.out.println(msj);
	}

	
}
