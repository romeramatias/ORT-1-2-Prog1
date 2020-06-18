package edu.ort.prog1.clase13;

public class Robot {

	// DUDAS
	// COMO SABER EL TAMANIO DEL ARRAY DE COLAS? VALUES DE TIPOFACTURA?
	// COMO QUEDARIA EL CONSTRUCTOR?
	// INSTANCIACION DE LAS COLAS?

	private static final int CANT_TIPOS_FACTURA = 4;
	private PilaFacturas pilaDeFacturas;
	private ColaFacturas[] colaDeFacturas;
	
	public Robot() {
		super();
		this.pilaDeFacturas = new PilaFacturas();	
		this.colaDeFacturas = new ColaFacturas[CANT_TIPOS_FACTURA];
		inicializarColas();
	}
	
	public void catalogar() {
		Factura facturaAux;	
		while (!this.pilaDeFacturas.isEmpty()) {
			facturaAux = this.pilaDeFacturas.pop();
			guardarEnCola(facturaAux);
		}
	}
	
	private void inicializarColas() {
		int index = 0; 
		while (index < this.colaDeFacturas.length) {
			this.colaDeFacturas[index] = new ColaFacturas();
			index++;
		}
	}
	
	private void guardarEnCola(Factura facturaAux) {
		this.colaDeFacturas[facturaAux.getTipo().ordinal()].add(facturaAux);	
	}

	public void mostrarDatosDeFactura(String codigoBarras) {
		int index = 0;
		Factura facturaEncontrada = null;
		
		while (index < this.colaDeFacturas.length && facturaEncontrada == null) {
			facturaEncontrada = buscarFacturaEnCola(codigoBarras, index);
			index++;
		}
		
		System.out.println((!(facturaEncontrada == null)) ? facturaEncontrada : "No existe Factura");
	}
	
	
	private Factura buscarFacturaEnCola(String codigoBarras, int numCola) {
		final String CODIGO_CENTINELA = "-1";
		// Objeto persona con el que vamos a ir extrayendo personas
		// de la cola
		Factura facturaEncontrada = null;
		Factura facturaAux;
		// Agregamos el centinela a la cola
		this.colaDeFacturas[numCola].add(new Factura(CODIGO_CENTINELA, TipoFactura.ABL, -1));
		// Guardo en una variable la primer persona de la cola
		facturaAux = colaDeFacturas[numCola].remove();
		// Preguntamos si esa factura tiene el codigo centinela
		// si no lo tiene entramos al while
		// si lo tiene es que ya recorrimos toda la cola
		while (!facturaAux.getCodigoBarras().equals(CODIGO_CENTINELA)) {
			if (facturaAux.getCodigoBarras().equals(codigoBarras)) {
				facturaEncontrada = facturaAux;
			}
			// Devolvemos la factura a la cola original
			this.colaDeFacturas[numCola].add(facturaAux);
			// Extraemos otra factura para volver al ciclo
			facturaAux = this.colaDeFacturas[numCola].remove();
		}
		
		return facturaEncontrada;
	}

	public PilaFacturas getPilaDeFacturas() {
		return pilaDeFacturas;
	}
	public void setPilaDeFacturas(PilaFacturas pilaDeFacturas) {
		this.pilaDeFacturas = pilaDeFacturas;
	}
	public ColaFacturas[] getColaDeFacturas() {
		return colaDeFacturas;
	}
	public void setColaDeFacturas(ColaFacturas[] colaDeFacturas) {
		this.colaDeFacturas = colaDeFacturas;
	} 
	public void agregarFacturasPila(Factura f) {
		this.pilaDeFacturas.push(f);
	}

}
