/**
 * @author romeramatias
 */
package edu.ort.prog1.tp;

public class Insumo implements Facturable{

	private String nombre;
	private TipoInsumo tipo;
	private double porcGanancia;
	private double precioLista;
	
	public Insumo(String nombre, TipoInsumo tipo, double porcGanancia, double precioLista) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.porcGanancia = porcGanancia;
		this.precioLista = precioLista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoInsumo getTipo() {
		return tipo;
	}

	public void setTipo(TipoInsumo tipo) {
		this.tipo = tipo;
	}

	public double getPorcGanancia() {
		return porcGanancia;
	}

	public void setPorcGanancia(double porcGanancia) {
		this.porcGanancia = porcGanancia;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}
	
	@Override
	public double calcularPrecio() {
		return Matematica.sumarPorcentaje(this.precioLista, this.porcGanancia);
	}
	
	@Override
	public double facturar() {
		double precioFinal = calcularPrecio();
		return Matematica.sumarPorcentaje(precioFinal, IVA);
	}
	
	
}
