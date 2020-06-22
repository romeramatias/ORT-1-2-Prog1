/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

public class EquipoMedico {

	private int consultorio;
	private ColaPacientes colaDePacientesEnEquipo;
		
	public EquipoMedico(int consultorio) {
		super();
		this.consultorio = consultorio;
		this.colaDePacientesEnEquipo = new ColaPacientes();
	}
	@Override
	public String toString() {
		return "EquipoMedico [consultorio=" + consultorio + ", colaDePacientesEnEquipo=" + colaDePacientesEnEquipo
				+ "]";
	}
	public int getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(int consultorio) {
		this.consultorio = consultorio;
	}
	public ColaPacientes getColaDePacientesEnEquipo() {
		return colaDePacientesEnEquipo;
	}
	public void setColaDePacientesEnEquipo(ColaPacientes colaDePacientesEnEquipo) {
		this.colaDePacientesEnEquipo = colaDePacientesEnEquipo;
	}
	
	
	
}
