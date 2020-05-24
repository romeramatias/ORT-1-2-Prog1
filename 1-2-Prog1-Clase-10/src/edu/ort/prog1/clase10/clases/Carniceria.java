/**
 * @author romeramatias
 */
package edu.ort.prog1.clase10.clases;

public class Carniceria {

	// Creo esta clase para ejemplificar busquedas y contadores en colas
	// Le pongo un limite de 10 personas
	private ColaPersonas colaCarniceria;
	private int capacidadCola;
	
	public Carniceria(int capacidadCarniceria) {
		super();
		this.capacidadCola = capacidadCarniceria;
		this.colaCarniceria = new ColaPersonas(capacidadCola);
	}
	
	// Metodos de buscar y contar personas en la cola de la carniceria
	public int contarPersonasColaCentinela() {
		// Creamos un centinela, en este caso un DNI 
		// que ninguna persona nunca tendra
		final String DNI_CENTINELA = "-1";
		// Objeto persona con el que vamos a ir extrayendo personas
		// de la cola
		Persona persona;
		int cont = 0;
		
		// Agregamos el centinela a la cola
		colaCarniceria.add(new Persona(DNI_CENTINELA));
		// Guardo en una variable la primer persona de la cola
		persona = colaCarniceria.remove();
		// Preguntamos si esa persona tiene el dni centinela
		// si no lo tiene entramos al while para contar
		// si lo tiene es que ya recorrimos toda la cola
		while (!persona.getDni().equals(DNI_CENTINELA)) {
			cont++;
			// Devolvemos la persona a la cola original
			colaCarniceria.add(persona);
			// Extraemos otra persona para volver a contar
			persona = colaCarniceria.remove();
		}
		
		// Con este metodo no tenemos que hacer el proceso que hicimos en pilas
		// ya que trabajamos siempre con la cola original y no tenemos que crear
		// una cola auxiliar y devolverle los elementos originales
		
		return cont;
	}
	
	public int contarPersonasColaConAux(){
		int cont = 0;
		ColaPersonas colaAux = new ColaPersonas(capacidadCola);
		
		while (!colaCarniceria.isEmpty()) {
			colaAux.add(colaCarniceria.remove());
			cont++;
		}
		pasarElementosDe(colaAux, colaCarniceria);
		
		// Metodo como el que usamos en las pilas
		// con un auxiliar y luego pasamos todos los elementos
			
		return cont;
	}
	
	private void pasarElementosDe(ColaPersonas source, ColaPersonas target){
		while (!source.isEmpty()) {
			target.add(source.remove());
		}
	}
	
	public Persona buscarPersonaPorDni(String dni) {
		Persona encontrada = null;
		Persona p;
		ColaPersonas colaAux = new ColaPersonas(capacidadCola);
		
		
		while ((!colaCarniceria.isEmpty()) && encontrada == null) {
			p = colaCarniceria.remove();
			colaAux.add(p);
			if (p.getDni().equals(dni)) {
				encontrada = p;
			}
		}
		
		pasarElementosDe(colaCarniceria, colaAux);
		colaCarniceria = colaAux;
		
		return encontrada;
	}
	
	public void agregarPersonasALaCola(Persona p) {
		this.colaCarniceria.add(p);
	}

	@Override
	public String toString() {
		return "Carniceria [colaCarniceria=" + colaCarniceria + "]";
	}

	public ColaPersonas getColaCarniceria() {
		return colaCarniceria;
	}

	public void setColaCarniceria(ColaPersonas colaCarniceria) {
		this.colaCarniceria = colaCarniceria;
	}
	
	
	
	
}
