package edu.ort.prog1.clase07;

public class ItemPedido {

	private int cantidad;
	private Articulo articulo;
	private boolean esCuarentena;
	
	public double getImporte() {
		return this.articulo.calcularPrecioFinal(this.esCuarentena) * cantidad;
	}
	
	public ItemPedido(int cantidad, Articulo articulo) {
		super();
		this.cantidad = cantidad;
		this.articulo = articulo;
	}
	@Override
	public String toString() {
		return "ItemPedido [cantidad=" + cantidad + ", producto=" + articulo + "]";
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Articulo getProducto() {
		return articulo;
	}
	public void setProducto(Articulo articulo) {
		this.articulo = articulo;
	}
	
	
}
