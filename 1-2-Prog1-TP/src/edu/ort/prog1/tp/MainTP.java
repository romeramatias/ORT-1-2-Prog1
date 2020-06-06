/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

public class MainTP {

	public static void main(String[] args) {
		
		// Creo un comercio
		Comercio amithlon = new Comercio("Amithlon");
		
		// Creo objetos facturables (insumos, servicios de armado y servicios de reparacion)
		Insumo mouse = new Insumo("Mouse Logitech", TipoInsumo.PERIFERICO, 15, 500); 	// 695,75
		Insumo gpu = new Insumo("RX 580", TipoInsumo.HARDWARE, 40, 10000); 				// 16940
		ServicioArmado armadoPcCarlos = new ServicioArmado(3); 							// 828.75
		ServicioArmado armadoPcMatias = new ServicioArmado(5); 							// 1381.25
		ServicioReparacion reparacionPcCarlos = new ServicioReparacion(5, 4); 			// 1243.125
		ServicioReparacion reparacionPcMatias = new ServicioReparacion(2, 2); 			// 397.80
		
		// Agrego los objetos al comercio
		amithlon.agregar(mouse);
		amithlon.agregar(gpu);
		amithlon.agregar(armadoPcCarlos);
		amithlon.agregar(armadoPcMatias);
		amithlon.agregar(reparacionPcCarlos);
		amithlon.agregar(reparacionPcMatias);
		
		// Metodo de monto total facturado
		System.out.println("Monto total facturado:");
		System.out.println(amithlon.montoTotalFacturado());
		System.out.println();
		
		// Metodo servicios reparaciones con mayor dificultad enviada por parametro
		System.out.println("Servicios de reparacion con mayor dificultad que:");
		System.out.println(amithlon.serviciosReparacionMasDificultadQue(1));	
		
		
	}

}
