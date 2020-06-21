/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

public class Main14 {

	public static void main(String[] args) {
		
		// Instanciamos una Empresa de Cable
		EmpresaCable empresa = new EmpresaCable();
		
		// Creamos algunos reclamos
		Reclamo r1 = new Reclamo(1, "Lunes", 444, 'c');
		Reclamo r2 = new Reclamo(2, "Martes", 888, 'a');
		Reclamo r3 = new Reclamo(3, "Miercoles", 222, 'a');
		Reclamo r4 = new Reclamo(4, "Jueves", 999, 'b');
		Reclamo r5 = new Reclamo(5, "Viernes", 777, 'b');

		// Creo una pila y le agrego los reclamos
		PilaReclamos pilaOperador1 = new PilaReclamos();
		pilaOperador1.push(r1);
		pilaOperador1.push(r2);
		pilaOperador1.push(r3);
		pilaOperador1.push(r4);
		pilaOperador1.push(r5);

		// Probamos los metodos de la clase EmpresaCable
		// Metodo de agregar reclamos, envia una pila y los encola segun cual ingreso primero
		empresa.agregarReclamo(pilaOperador1);
		System.out.println(empresa);
		
		// Metodo que obtiene el primer reclamos en la cola segun la prioridad enviada
		System.out.println(empresa.procesarReclamoPri('a'));
		
		
	}

}
