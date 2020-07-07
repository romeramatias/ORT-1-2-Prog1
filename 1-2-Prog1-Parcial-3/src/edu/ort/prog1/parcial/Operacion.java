/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Operacion extends Tarjeta{


	private TipoOperacion tipo;
	private int numMazo;
	private int cantCartas;


	public Operacion(String id, TipoOperacion tipo, int numMazo, int cantCartas) {
		super(id);
		this.tipo = tipo;
		this.numMazo = numMazo;
		this.cantCartas = cantCartas;
	}

	@Override
	public void mostrar() {
		System.out.println("Operacion [tipo=" + tipo + ", numMazo=" + numMazo + ", cantCartas=" + cantCartas + "]");
	}

	public TipoOperacion getTipo() {
		return tipo;
	}


	public void setTipo(TipoOperacion tipo) {
		this.tipo = tipo;
	}


	public int getNumMazo() {
		return numMazo;
	}


	public void setNumMazo(int numMazo) {
		this.numMazo = numMazo;
	}


	public int getCantCartas() {
		return cantCartas;
	}


	public void setCantCartas(int cantCartas) {
		this.cantCartas = cantCartas;
	}

	@Override
	public String toString() {
		return "Operacion [tipo=" + tipo + ", numMazo=" + numMazo + ", cantCartas=" + cantCartas + "]";
	}
	
	
	
	
}
