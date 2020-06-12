/**
 * @author romeramatias
 */
package edu.ort.prog1.clase12.clases;

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
	
	public Auto eliminar(String patente) {
		Auto autoEncontrado = null;
		Auto autoAux;
		NodoAuto aux;
		
		if (!estaVacia()) {
			// Me guardo el primer nodo y el primer auto
			// Si el primer auto tiene la misma patente
			// Pasada por parametros
			aux = this.primero;
			autoAux = aux.getDato();
			if (autoAux.getPatente().equals(patente)) {
				// Guardamos el auto y borramos la referencia del nodo
				// que contiene el auto
				autoEncontrado = autoAux;
				// Antes:	N(primero) -> N(segundo) -> N(tercero)
				// Despues:	N(segundo) -> N(tercero)
				// Quitamos la referencia del primero reemplazandola por el siguiente
				this.primero = this.primero.getNext();
			} else {
				// En caso de que no sea el primero entramos a un metodo que
				// busca el auto con la misma patente y devuelve el nodo anterior
				// al nodo que contiene la patente
				NodoAuto anterior = buscarNodoAnterior(patente);
				if (anterior != null) {
					autoEncontrado = anterior.getNext().getDato();
					anterior.setNext(anterior.getNext().getNext());
				}
			}
		}
		return autoEncontrado;
	}

	private NodoAuto buscarNodoAnterior(String patente) {
		NodoAuto nodoEncontrado = null;
		NodoAuto nodoAux;
		
		// Empezamos guardando el primer nodo en una variable auxiliar
		nodoAux = this.primero;
		// Mientras que halla siguiente y el nodo no haya sido encontrado
		// Nunca entramos al while si llego al ultimo nodo
		while (nodoAux.hasNext() && nodoEncontrado == null) {
			// Preguntamos si la PATENTE del AUTO del NODO SIGUIENTE al AUXILIAR
			// es la que enviamos por parametros
			if (nodoAux.getNext().getDato().getPatente().equals(patente)){
				// En caso de que sea, guardamos este nodo ya que
				// con la condicion anterior nos aseguramos de que sea el nodo
				// anterior al que contiene el auto con la patente
				nodoEncontrado = nodoAux;
			} else {
				// Caso contrario seguimos iterendo, guardando el siguiente nodo
				// en la variable auxiliar
				nodoAux = nodoAux.getNext();
			}
		}
		
		return nodoEncontrado;
	}
	


}
