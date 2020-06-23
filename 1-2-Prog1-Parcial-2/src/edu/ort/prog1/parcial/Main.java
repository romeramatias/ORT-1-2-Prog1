/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Main {

	public static void main(String[] args) {
		
		// Instanciamos un garage
		Garage garage = new Garage();
			
		// Estaciono 17 autos al garage, de tal manera que el primer piso
		// quede lleno y pasemos a recorrer el segundo
		System.out.println(garage.estacionar(new Vehiculo("FFF 111", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("GGG 222", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("TTT 333", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("RRR 444", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("EEE 555", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("SSS 666", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("YYY 777", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("MMM 888", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("QQQ 999", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("JJJ 110", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("OOO 120", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("DDD 130", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("HHH 140", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("III 150", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("NNN 160", "Ford", "F100")));
		System.out.println(garage.estacionar(new Vehiculo("AAA 170", "Ford", "F100")));
		System.out.println();
		
		// Muestro el garage con sus pisos y vehiculos
		System.out.println(garage);
		System.out.println();
		
		// Busco dos vehiculos por patente, uno valido y otro invalido
		System.out.println(garage.retirar("GGG 222"));
		garage.retirar("sss");
		System.out.println();
		
		// Compruebo si el vehiculo GGG 222 fue retirado del piso
		System.out.println(garage);
		
		
	}

}
