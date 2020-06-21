/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

public class EmpresaCable {

	private ColaReclamos colaDeReclamosAProcesar;
	private PilaReclamos pilaDeReclamos;
	
	public EmpresaCable() {
		super();
		this.colaDeReclamosAProcesar = new ColaReclamos();
		this.pilaDeReclamos = new PilaReclamos();
	}

	
	public void agregarReclamo(PilaReclamos pila) {
		ColaReclamos colaAux = new ColaReclamos();
		PilaReclamos pilaAux = new PilaReclamos();
		
		pasarElementos(pila, pilaAux);
		guardarEnCola(pilaAux, colaAux);
		this.colaDeReclamosAProcesar = colaAux;
		
	}
	
	private void pasarElementos(PilaReclamos source, PilaReclamos target) {
		// Ordena la pila con el ultimo elemento primero
		// Mas que pasar elementos se deberia llamar ordenarPila
		
		while (!source.isEmpty()) {
			target.push(source.pop());
		}
		
	}
	

	private void guardarEnCola(PilaReclamos pila, ColaReclamos cola) {
		while (!pila.isEmpty()) {
			cola.add(pila.pop());
		}
	}

	public Reclamo procesarReclamoPri(char prioridad) {
		Reclamo reclamoAux;
		Reclamo encontrado = null;
		ColaReclamos colaAux = new ColaReclamos();
		
		while (!(this.colaDeReclamosAProcesar.isEmpty()) && encontrado == null) {
			reclamoAux = this.colaDeReclamosAProcesar.remove();
			if (reclamoAux.getPrioridad() == prioridad) {
				encontrado = reclamoAux;
			} else {
				colaAux.add(reclamoAux);
			}
		}
		
		pasarElementos(this.colaDeReclamosAProcesar, colaAux);
		this.colaDeReclamosAProcesar = colaAux;
		
		return encontrado;
	}

	private void pasarElementos(ColaReclamos source, ColaReclamos target) {
		// Ordena la pila con el ultimo elemento primero
		// Mas que pasar elementos se deberia llamar ordenarPila
		
		while (!source.isEmpty()) {
			target.add(source.remove());
		}
		
	}
	

	public ColaReclamos getColaDeReclamosAProcesar() {
		return colaDeReclamosAProcesar;
	}

	public void setColaDeReclamosAProcesar(ColaReclamos colaDeReclamosAProcesar) {
		this.colaDeReclamosAProcesar = colaDeReclamosAProcesar;
	}

	public PilaReclamos getPilaDeReclamos() {
		return pilaDeReclamos;
	}

	public void setPilaDeReclamos(PilaReclamos pilaDeReclamos) {
		this.pilaDeReclamos = pilaDeReclamos;
	}
	
	@Override
	public String toString() {
		return "EmpresaCable [colaDeReclamosAProcesar=" + colaDeReclamosAProcesar + ", pilaDeReclamos=" + pilaDeReclamos
				+ "]";
	}
	
	
	
}
