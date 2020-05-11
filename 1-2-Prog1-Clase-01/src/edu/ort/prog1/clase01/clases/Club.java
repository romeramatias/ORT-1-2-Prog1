package edu.ort.prog1.clase01.clases;

import java.util.*;

public class Club {

	private String stringNombre;
	private Integer intAnioFundacion;

	private Jugador[] jugadores;

	// Metodo 1 de Mostar Jugadores por Posicion usando un ciclo while
	// asume que los datos fueron cargados de izquierda a derecha y que al eliminar,
	// se reordena el array (se agrupan los valores, quedando todos los nulls a la
	// derecha).
	// Recorremos con while hasta encontrar el primer nulo.
	public void MostarJugadoresSegunPosicionWhile(Posicion posicion) {
		Integer index = 0;

		while (index < this.jugadores.length && this.jugadores[index] != null) {
			if (this.jugadores[index].getEnumPosicion() == posicion) {
				System.out.println(this.jugadores[index]);
			}
			index++;
		}
	}

	// Metodo 2 de Mostar Jugadores por Posicion usando un ciclo foreach
	// asume que puede haber "huecos" en el array de jugadores (valores null
	// dispersos).
	// Usamos un foreach controlando que cada objeto no sea null.
	// si un valor es null, dara un error
	public void MostarJugadoresSegunPosicionForeach(Posicion posicion) {

		for (Jugador j : this.jugadores) {
			if (j.getEnumPosicion().equals(posicion)) {
				System.out.println(j);
			}
		}
	}

	// Metodo 1
	public ArrayList<Jugador> listaJugadoresMayoresWhile(int edad) {
		ArrayList<Jugador> jugadoresMayores = new ArrayList<>();
		Integer index = 0;

		while (index < this.jugadores.length && this.jugadores[index] != null) {
			if (this.jugadores[index].getIntEdad() > edad) {
				jugadoresMayores.add(this.jugadores[index]);
			}
			index++;
		}

		return jugadoresMayores;
	}

	// Metodo 2, cuando un valor es null, dara un error
	public ArrayList<Jugador> listaJugadoresMayoresForeach(int edad) {
		ArrayList<Jugador> jugadoresMayores = new ArrayList<>();

		for (Jugador j : this.jugadores) {
			if (j.getIntEdad() > edad) {
				jugadoresMayores.add(j);
				System.out.println("Recorrido numero");
			}
		}

		return jugadoresMayores;
	}

	public void agregarJugador(int edad, int numero, String apellido, boolean titular, Enum<PiernaHabil> pierna,
			Enum<Posicion> posicion, int numeroListaJugador) {
		
		Jugador jugador = new Jugador(edad, numero, apellido, titular, pierna, posicion);
		jugadores[numeroListaJugador] = jugador;
	}

	public void cambiarNumeroCamiseta(int numeroActual, int nuevoNumero) {
		Jugador jugador = buscarJugador1(numeroActual);

		if (jugador != null && buscarJugador1(nuevoNumero) == null) {
			jugador.setIntNumero(nuevoNumero);
			System.out.println("Cambio de numero de camiseta realizado correctamente");
		} else {
			System.out.println("No es posible realizar el cambio de numero de camiseta");
		}
	}

	// Metodo 1 de buscar en un array
	private Jugador buscarJugador1(int numero) {
		Jugador jEncontrado = null;
		int index = 0;

		while (jEncontrado == null && index < this.jugadores.length && this.jugadores[index] != null) {
			if (this.jugadores[index].getIntNumero() == numero) {
				jEncontrado = this.jugadores[index];
			} else {
				index++;
			}
		}

		return jEncontrado;
	}

	// Metodo 2 de buscar en un array, con auxiliar similar al de siempre
	public Jugador buscarJugador2(int numero) {
		Jugador jEncontrado = null;
		Jugador auxiliar;
		int index = 0;

		while (jEncontrado == null && index < this.jugadores.length) {
			auxiliar = this.jugadores[index];
			if (auxiliar != null && auxiliar.getIntNumero().equals(numero)) {
				jEncontrado = auxiliar;
			}
			index++;
		}
		return jEncontrado;
	}

	public Club(String stringNombre, Integer intAnioFundacion) {
		super();
		this.stringNombre = stringNombre;
		this.intAnioFundacion = intAnioFundacion;
		this.jugadores = new Jugador[18];
		;
	}

	@Override
	public String toString() {
		return "Club [stringNombre=" + stringNombre + ", intAnioFundacion=" + intAnioFundacion + ", jugadores="
				+ Arrays.toString(jugadores) + "]";
	}

	public String getStringNombre() {
		return stringNombre;
	}

	public void setStringNombre(String stringNombre) {
		this.stringNombre = stringNombre;
	}

	public Integer getIntAnioFundacion() {
		return intAnioFundacion;
	}

	public void setIntAnioFundacion(Integer intAnioFundacion) {
		this.intAnioFundacion = intAnioFundacion;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

}
