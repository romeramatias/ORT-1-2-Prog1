/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

public class ArticuloExportacion extends Articulo{

	private static final double DESC = 1;
	private int numeroExportacion;

	@Override
	public double calcularDescuento() {
		return DESC;
	}

	public int getNumeroExportacion() {
		return numeroExportacion;
	}

	public void setNumeroExportacion(int numeroExportacion) {
		this.numeroExportacion = numeroExportacion;
	}

	public static double getDesc() {
		return DESC;
	}
	
	
}
