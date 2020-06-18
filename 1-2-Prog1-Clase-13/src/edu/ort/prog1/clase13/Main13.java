package edu.ort.prog1.clase13;

public class Main13 {

	public static void main(String[] args) {
		
		// Instanciamos un Robot
		Robot robot = new Robot();
		
		// Creo algunas facturas para agregarlas a la pila desordenadas
		Factura f1 = new Factura("1111", TipoFactura.ABL, 110);
		Factura f2 = new Factura("2222", TipoFactura.LUZ, 120);
		Factura f3 = new Factura("3333", TipoFactura.AGUA, 130);
		Factura f4 = new Factura("4444", TipoFactura.ABL, 140);
		Factura f5 = new Factura("5555", TipoFactura.GAS, 150);
		Factura f6 = new Factura("6666", TipoFactura.GAS, 160);
		Factura f7 = new Factura("7777", TipoFactura.LUZ, 170);
		
		// Agrego las facturas a la pila desordenada
		robot.agregarFacturasPila(f1);
		robot.agregarFacturasPila(f2);
		robot.agregarFacturasPila(f3);
		robot.agregarFacturasPila(f4);
		robot.agregarFacturasPila(f5);
		robot.agregarFacturasPila(f6);
		robot.agregarFacturasPila(f7);
				
		// Metodo que cataloga las facturas por tipo en distintas colas
		robot.catalogar();
		
		// Metodo que enviando un codigo de barras devuelve los datos de una facturass
		robot.mostrarDatosDeFactura("4444");

	}

}
