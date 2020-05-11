package edu.ort.prog1.clase07.clases;

import java.util.ArrayList;

import edu.ort.prog1.clase07.enums.FormaDePago;

public class Pedido {

	private String numeroPed;
	private String fecha;
	
	private Mozo mozo;
	private Enum<FormaDePago> formaDePago;
	private Cocinero cocinero;
	private Mesa mesa;
	private ArrayList<ItemPedido> items;
	
	public double importeAPagar() {
		double sum = 0;
		for (ItemPedido i : items) {
			sum += i.getImporte(this.formaDePago);
		}
		return sum;
	}
	
	
	public Pedido(String numeroPed, String fecha, Mozo mozo, Enum<FormaDePago> formaDePago, Cocinero cocinero,
			Mesa mesa, ArrayList<ItemPedido> items) {
		super();
		this.numeroPed = numeroPed;
		this.fecha = fecha;
		this.mozo = mozo;
		this.formaDePago = formaDePago;
		this.cocinero = cocinero;
		this.mesa = mesa;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Pedido [numeroPed=" + numeroPed + ", fecha=" + fecha + ", mozo=" + mozo + ", formaDePago=" + formaDePago
				+ ", cocinero=" + cocinero + ", mesa=" + mesa + ", items=" + items + "]";
	}
	public Mozo getMozo() {
		return mozo;
	}
	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}
	public Enum<FormaDePago> getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(Enum<FormaDePago> formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Cocinero getCocinero() {
		return cocinero;
	}
	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}
	public String getNumeroPed() {
		return numeroPed;
	}
	public void setNumeroPed(String numeroPed) {
		this.numeroPed = numeroPed;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public ArrayList<ItemPedido> getItems() {
		return items;
	}
	public void setItems(ArrayList<ItemPedido> items) {
		this.items = items;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
		
}
