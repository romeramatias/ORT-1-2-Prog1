package edu.ort.prog1.clase06;

// Una interface siempre es abstracta, no se puede instanciar
// Solo tienen metodos abstractos y posiblemente constantes
// Los metodos y atributos son publicos, no es necesario poner el modificador

// En que casos se usan interfaces?
// Cuando hay objetos que pertenecen a jererquias diferentes pero comparten
// un comportamiento
// Casi siempre para los comportamientos usar interfaces

// En UML se hace una flecha con la punta de herencia pero la linea punteada

public interface EnviadorDeMensajes {

	void enviarMensaje(String msj);
}
