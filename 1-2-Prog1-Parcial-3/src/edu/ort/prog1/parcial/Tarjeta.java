/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public abstract class Tarjeta implements Mostrable{

	private String id;

	public Tarjeta(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	
	
}
