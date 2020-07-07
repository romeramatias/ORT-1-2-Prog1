/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

import java.util.Arrays;

public class Juego {

	private static final int CANT_MAZOS = 4;
	private ColaOperaciones colaDeOperaciones;
	private PilaCartas[] mazos;

	public Juego() {
		super();
		inicializarMazos();
		this.colaDeOperaciones = new ColaOperaciones();
		agregarDatosAMazos();
		agregarOperacionesACola();
	}

	private void agregarOperacionesACola() {
		this.colaDeOperaciones.add(new Operacion("99", TipoOperacion.ELIMINAR, 2, 1));
		this.colaDeOperaciones.add(new Operacion("98", TipoOperacion.DERECHA, 1, 2));
		this.colaDeOperaciones.add(new Operacion("97", TipoOperacion.IZQUIERDA, 3, 6));

	}

	public void procesarOperaciones() {
		Operacion ope;

		while (!this.colaDeOperaciones.isEmpty()) {
			ope = this.colaDeOperaciones.remove();
			if (ope.getCantCartas() <= 3 && (ope.getNumMazo() >= 0 || ope.getNumMazo() <= 3)) {
				realizarOperacion(ope);
			}
		}
	}

	private void realizarOperacion(Operacion ope) {
		comprobarTipoOperacion(ope);
	}

	private void comprobarTipoOperacion(Operacion ope) {
		int cantCartas = ope.getCantCartas();
		int numMazo = ope.getNumMazo() - 1;

		switch (ope.getTipo()) {
		case DERECHA:
			moverCartaDerecha(numMazo, cantCartas);
			break;

		case IZQUIERDA:
			moverCartaIzquierda(numMazo, cantCartas);
			break;

		case ELIMINAR:
			eliminar(numMazo, cantCartas);
			break;
		}
	}

	private void moverCartaDerecha(int numMazo, int cantCartas) {
		int derecha = 1;

		if (comprobarTamanio(numMazo, cantCartas)) {
			while (cantCartas > 0) {
				if (numMazo == 3) {
					this.mazos[derecha].push(this.mazos[numMazo].pop());
					cantCartas--;
				} else {
					this.mazos[numMazo + 1].push(this.mazos[numMazo].pop());
					cantCartas--;
				}
			}
		}

	}

	private void moverCartaIzquierda(int numMazo, int cantCartas) {
		int izquierda = 3;

		if (comprobarTamanio(numMazo, cantCartas)) {
			while (cantCartas > 0) {
				if (numMazo == 0) {
					this.mazos[izquierda].push(this.mazos[numMazo].pop());
					cantCartas--;
				} else {
					this.mazos[numMazo - 1].push(this.mazos[numMazo].pop());
					cantCartas--;
				}
			}
		}

	}

	private void eliminar(int numMazo, int cantCartas) {

		if (comprobarTamanio(numMazo, cantCartas)) {
			while (cantCartas > 0) {
				this.mazos[numMazo].pop();
				cantCartas--;
			}
		}
	}

	private boolean comprobarTamanio(int numMazo, int cantCartas) {
		int tamanio = 0;
		PilaCartas pilaAux = new PilaCartas();

		while (!this.mazos[numMazo].isEmpty()) {
			pilaAux.push(this.mazos[numMazo].pop());
			tamanio++;
		}

		pasarElementosDe(pilaAux, this.mazos[numMazo]);

		return tamanio >= cantCartas ? true : false;
	}

	private void pasarElementosDe(PilaCartas source, PilaCartas target) {

		while (!source.isEmpty()) {
			target.push(source.pop());
		}

	}

	private void inicializarMazos() {
		this.mazos = new PilaCartas[CANT_MAZOS];
		for (int i = 0; i < mazos.length; i++) {
			this.mazos[i] = new PilaCartas();
		}
	}

	// Harcodeo los datos del enunciado
	private void agregarDatosAMazos() {
		this.mazos[0].push(new Carta("1", 'S'));
		this.mazos[0].push(new Carta("2", 'R'));
		this.mazos[0].push(new Carta("3", 'F'));
		this.mazos[0].push(new Carta("4", 'E'));
		this.mazos[0].push(new Carta("5", 'A'));

		this.mazos[1].push(new Carta("6", 'L'));
		this.mazos[1].push(new Carta("7", 'F'));
		this.mazos[1].push(new Carta("8", 'T'));
		this.mazos[1].push(new Carta("9", 'D'));

		this.mazos[2].push(new Carta("10", 'U'));
		this.mazos[2].push(new Carta("11", 'N'));
		this.mazos[2].push(new Carta("12", 'R'));
		this.mazos[2].push(new Carta("13", 'B'));
		this.mazos[2].push(new Carta("14", 'H'));

		this.mazos[3].push(new Carta("15", 'G'));
		this.mazos[3].push(new Carta("16", 'Z'));
		this.mazos[3].push(new Carta("17", 'N'));
	}

	public ColaOperaciones getColaDeOperaciones() {
		return colaDeOperaciones;
	}

	public void setColaDeOperaciones(ColaOperaciones colaDeOperaciones) {
		this.colaDeOperaciones = colaDeOperaciones;
	}

	public PilaCartas[] getMazos() {
		return mazos;
	}

	public void setMazos(PilaCartas[] mazos) {
		this.mazos = mazos;
	}

	public static int getCantMazos() {
		return CANT_MAZOS;
	}

	@Override
	public String toString() {
		return "Juego [colaDeOperaciones=" + colaDeOperaciones + ", mazos=" + Arrays.toString(mazos) + "]";
	}

}
