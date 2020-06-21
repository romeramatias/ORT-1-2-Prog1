/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

public class Reclamo {

	private int numeroReclamo;
	private String fecha;
	private int numCliente;
	private char prioridad;
	
	
	public Reclamo(int numeroReclamo, String fecha, int numCliente, char prioridad) {
		super();
		this.numeroReclamo = numeroReclamo;
		this.fecha = fecha;
		this.numCliente = numCliente;
		this.prioridad = prioridad;
	}
	@Override
	public String toString() {
		return "Reclamos [numeroReclamo=" + numeroReclamo + ", fecha=" + fecha + ", numCliente=" + numCliente
				+ ", prioridad=" + prioridad + "]";
	}
	public int getNumeroReclamo() {
		return numeroReclamo;
	}
	public void setNumeroReclamo(int numeroReclamo) {
		this.numeroReclamo = numeroReclamo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	public char getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(char prioridad) {
		this.prioridad = prioridad;
	}
	
	
}
