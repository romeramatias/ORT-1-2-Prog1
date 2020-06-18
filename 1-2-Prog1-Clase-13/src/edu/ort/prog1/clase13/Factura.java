package edu.ort.prog1.clase13;

public class Factura {

	private String codigoBarras;
	private TipoFactura tipo;
	private double monto;
	
	public Factura(String codigoBarras, TipoFactura tipo, double monto) {
		super();
		this.codigoBarras = codigoBarras;
		this.tipo = tipo;
		this.monto = monto;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public TipoFactura getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoFactura tipo) {
		this.tipo = tipo;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Factura [codigoBarras=" + codigoBarras + ", tipo=" + tipo + ", monto=" + monto + "]";
	}
	
	
	
}
