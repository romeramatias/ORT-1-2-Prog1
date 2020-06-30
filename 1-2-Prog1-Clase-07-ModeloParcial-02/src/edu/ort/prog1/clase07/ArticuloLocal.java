/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

public class ArticuloLocal extends Articulo {

	private static final double DESC_CELIACO = 5;
	private int codigoBarras;

	@Override
	public double calcularDescuento() {
		double descuento = 0;
		
		if (!super.esAptoCeliaco()) {
			descuento = DESC_CELIACO;
		}
		
		return descuento;
		
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public static double getDescCeliaco() {
		return DESC_CELIACO;
	}
	
	
	
}
