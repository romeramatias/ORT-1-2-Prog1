/** @author romeramatias 
 */
package edu.ort.prog1.parcial;

public class AlumnoMayor extends Alumno{


	public AlumnoMayor(String nombre, String dni, String nombreCurso, int edad) {
		super(nombre, dni, nombreCurso);
		this.edad = edad;
	}

	private int edad;
	private static final double DESC = 5;
	private static final double TOPE_DESC = 30;

	
	
	public double getDescuento() {
		int aniosDescuento;
		double porcDescuento;
		
		aniosDescuento = this.edad - 60;
		porcDescuento = aniosDescuento * DESC;
		if (porcDescuento > TOPE_DESC) {
			porcDescuento = TOPE_DESC;
		}
		
		return super.getMontoFijo() * porcDescuento / 100;
	}
}
