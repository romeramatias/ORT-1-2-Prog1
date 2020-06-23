/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Main {

	public static void main(String[] args) {
		
		// Instanciamos un garage
		Garage garage = new Garage();
			
		// Estaciono 50 autos al garage, de tal manera que todos los pisos queden
		// completamente llenos y al intentar estacionar uno mas, me de false
		System.out.println(garage.estacionar(new Vehiculo("AAA 01", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 02", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 03", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 04", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 05", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 06", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 07", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 08", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 09", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 10", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 11", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 12", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 13", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 14", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 15", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 16", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 17", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 18", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 19", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 20", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 21", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 22", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 23", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 24", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 25", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 26", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 27", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 28", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 29", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 30", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 31", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 32", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 33", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 34", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 35", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 36", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 37", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 38", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 39", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 40", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 41", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 42", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 43", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 44", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 45", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 46", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 47", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 48", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 49", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 50", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA EXCEDIDO", "Ford", "F100")));
		System.out.println();
		
		// Muestro el garage con sus pisos y vehiculos
		System.out.println(garage);
		System.out.println();
		
		// Busco dos vehiculos por patente, uno valido y otro invalido
		System.out.println(garage.retirar("AAA 23"));
		garage.retirar("sss");
		System.out.println();
		System.out.println(garage.estacionar(new Vehiculo("AAA EXCEDIDO", "Ford", "F100")));

		// Compruebo si el vehiculo GGG 222 fue retirado del piso
		System.out.println(garage);
		
		
	}

}
