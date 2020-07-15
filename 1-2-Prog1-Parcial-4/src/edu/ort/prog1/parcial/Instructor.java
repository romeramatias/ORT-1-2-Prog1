/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class Instructor {

	private int num;
	private String apellido;
	
	public Instructor(int num, String apellido) {
		super();
		this.num = num;
		this.apellido = apellido;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
}
