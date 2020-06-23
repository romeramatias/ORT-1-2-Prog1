/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Main {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
				
		System.out.println(garage.estacionar(new Vehiculo("xx", "ford", "f100")));
		System.out.println(garage.estacionar(new Vehiculo("xx", "ford", "f100")));
		System.out.println(garage.estacionar(new Vehiculo("xx", "ford", "f100")));
		System.out.println(garage.estacionar(new Vehiculo("xx", "ford", "f100")));
		System.out.println(garage.estacionar(new Vehiculo("RR", "ford", "f100")));

		System.out.println(garage);
		
		
		System.out.println(garage.retirar("RR"));
		garage.retirar("sss");

		System.out.println(garage);
	}

}
