package edu.ort.prog1.clase07.clases;

import edu.ort.prog1.clase07.enums.FormaDePago;

public class ItemPedido {

	private int cantidad;
	private Producto producto;
	
	
	public double getImporte(Enum<FormaDePago> pago) {
		double importe = producto.getPrecio() * cantidad;

		if (pago == FormaDePago.EFECTIVO) {
			importe = importe - (importe * producto.getDescuento());
		}
		
		return importe;
	}
	
	public ItemPedido(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "ItemPedido [cantidad=" + cantidad + ", producto=" + producto + "]";
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
