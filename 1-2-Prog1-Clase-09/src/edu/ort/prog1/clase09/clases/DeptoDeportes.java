package edu.ort.prog1.clase09.clases;

import java.util.ArrayList;

public class DeptoDeportes {

	private ArrayList<PilaPelotas> pilasPelotas;

	public DeptoDeportes(int cantPilas) {
		super();
		this.pilasPelotas = new ArrayList<>();
		agregarPilas(cantPilas);
	}

	private void agregarPilas(int i) {
		for (int j = 0; j < i; j++) {
			pilasPelotas.add(new PilaPelotas());
		}
	}

	// Metodos
	public void agregarPelota(Pelota p) {
		// recorrer las pilas hasta que encuentre una que no este llena
		int index = 0;
		boolean agregue = false;

		while (this.pilasPelotas.size() > index && agregue == false) {
			if (!this.pilasPelotas.get(index).isFull()) {
				this.pilasPelotas.get(index).push(p);
				agregue = true;

			}
			index++;
		}

		System.out.println(agregue ? "Pelota agregada" : "No hay espacio");

	}

	public void verPelotasEnTope() {
		// mostrar el peek de las tres pilas
		for (PilaPelotas pilaPelotas : pilasPelotas) {
			System.out.print("Tope de la pila ");
			System.out.println(pilaPelotas.peek());
		}
	}

	public Pelota buscarPelota(String codigo) {
		Pelota pel = null;
		PilaPelotas aux = new PilaPelotas();

		for (PilaPelotas p : pilasPelotas) {
			while (!p.isEmpty()) {
				aux.push(p.pop());
				if (aux.peek().getCodigo().equals(codigo)) {
					pel = aux.peek();
				}
			}
			pasarElementosDe(aux, p);
		}
		return pel;

	}
	
	private void pasarElementosDe(PilaPelotas source, PilaPelotas target) {
		
		while (!source.isEmpty()) {
			target.push(source.pop());
		}
		
	}

	// Pelota pel = null;
//		int index = 0;
//		// no se si puedo directamente buscar en el arraylist o que politicas tienen las pilas
//		while (this.pilasPelotas.size() > index && pel == null) {
//			
//		}
//		
//		return pel;

	public ArrayList<PilaPelotas> getPilasPelotas() {
		return pilasPelotas;
	}

	public void setPilasPelotas(ArrayList<PilaPelotas> pilasPelotas) {
		this.pilasPelotas = pilasPelotas;
	}

	@Override
	public String toString() {
		return "DeptoDeportes [pilasPelotas=" + pilasPelotas + "]";
	}

}
