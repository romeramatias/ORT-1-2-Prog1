/**
 * @author romeramatias
 */
package edu.ort.edu.prog1.clase11.clases;

public class ListaAutos {

	private NodoAuto primero;

	public boolean estaVacia() {
		return this.primero == null;
	}

	public void agregarAlPrincipio(Auto auto) {
		NodoAuto nuevo = new NodoAuto(auto);
		nuevo.setNext(this.primero);
		this.primero = nuevo;
	}

	public void agregarAlFinal(Auto auto) {
		if (estaVacia()) {
			agregarAlPrincipio(auto);
		} else {
			agregarLuegoDe(ultimo(), auto);
		}
	}

	public void agregarLuegoDe(NodoAuto nodo, Auto auto) {
		NodoAuto nuevoNodo = new NodoAuto(auto);
		// El nuevo nodo guarda la referencia de los siguientes nodos
		nuevoNodo.setNext(nodo.getNext());
		// Y ahora asigno al nuevo nodo LUEGO DE el nodo que me llego por parametro
		nodo.setNext(nuevoNodo);

		// Siempre hay que guardar las referencias para no perder la lista
		// Cuidar el orden de las asignaciones
	}

	public NodoAuto ultimo() {
		NodoAuto aux = this.primero;
		if (!estaVacia()) {
			while (aux.hasNext()) {
				aux = aux.getNext();
			}
		}
		return aux;

	}

	public void mostrarTodo() {
		NodoAuto aux = this.primero;
		if (!estaVacia()) {
			while (aux.hasNext()) {
				System.out.println(aux.getDato().toString());
				aux = aux.getNext();
			}
			System.out.println(aux.getDato().toString());
		} else {
			System.out.println("Lista vacia");
		}
	}

	public int size() {
		int cont = 0;
		NodoAuto aux = this.primero;
		if (!estaVacia()) {
			while (aux.hasNext()) {
				aux = aux.getNext();
				cont++;
			}
			cont++;
		}
		return cont;
	}

	public Auto get(int i) {
		Auto auto = null;
		NodoAuto aux = this.primero;
		int cont = 0;

		if (!estaVacia()) {
			while (cont < this.size()) {
				if (cont == i) {
					auto = aux.getDato();
					return auto;
				}
				aux = aux.getNext();
				cont++;
			}
		}
		return auto;
	}


}
