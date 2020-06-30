/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

import java.util.ArrayList;

public class Pedido {

	private Cliente cliente;
	private ArrayList<ItemPedido> items;
	private EmpleadoVendedor vendedor;
	private EmpleadoDespachante despachante;
	private Fecha fecha;
	
	public double totalPedido() {
		double costoTotal = 0;

		for (ItemPedido itemPedido : items) {
			costoTotal += itemPedido.getImporte();
		}

		return costoTotal;
	}
	
	public boolean esAnioMes(int anio, int mes) {
		return fecha.getAnio() == anio && fecha.getMes() == mes;
	}

	public void agregarItem(Articulo articulo, int cantidad) {
		items.add(new ItemPedido(cantidad, articulo));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemPedido> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemPedido> items) {
		this.items = items;
	}

	public EmpleadoVendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(EmpleadoVendedor vendedor) {
		this.vendedor = vendedor;
	}

	public EmpleadoDespachante getDespachante() {
		return despachante;
	}

	public void setDespachante(EmpleadoDespachante despachante) {
		this.despachante = despachante;
	}
	
	
}
