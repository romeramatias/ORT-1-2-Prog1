/** @author romeramatias 
 */
package edu.ort.prog1.clase14;

import java.util.Arrays;

public class Hospital {

	private ColaPacientes colaDePacientesEnEspera;
	private EquipoMedico[] equiposMedicos;
	private final int CANT_EQUIP_MEDICOS = 5;
	
	public Hospital() {
		super();
		this.colaDePacientesEnEspera = new ColaPacientes();
		this.equiposMedicos = new EquipoMedico[CANT_EQUIP_MEDICOS];
		inicializarEquiposMedicos();
	}

	public void asignarPacientes() {
		String DNI_CENTINELA = "-1";
		char CHAR_CONSULTA = 'C';
		Paciente paciente;
		int numCola = 0;
		
		this.colaDePacientesEnEspera.add(new Paciente(DNI_CENTINELA));
		paciente = this.colaDePacientesEnEspera.remove();
		while (!paciente.getDni().equals(DNI_CENTINELA)) {
			if (paciente.getTipoPaciente() != CHAR_CONSULTA) {
				asignarPacienteEnColaDeEquiposMedicos(paciente, numCola);
				numCola++;
				if (numCola > CANT_EQUIP_MEDICOS-1) {
					numCola = 0;
				}
			} else {
				this.colaDePacientesEnEspera.add(paciente);
			}
			paciente = this.colaDePacientesEnEspera.remove();
		}
		asignarPacientesTipoConsulta(numCola);
	}
	
	private void asignarPacientesTipoConsulta(int numCola) {
		Paciente paciente;
		
		while (!this.colaDePacientesEnEspera.isEmpty()) {
			paciente = this.colaDePacientesEnEspera.remove();
			asignarPacienteEnColaDeEquiposMedicos(paciente, numCola);
			numCola++;
			if (numCola > CANT_EQUIP_MEDICOS-1) {
				numCola = 0;
			}
		}
	}

	private void asignarPacienteEnColaDeEquiposMedicos(Paciente paciente, int numCola) {
		this.equiposMedicos[numCola].getColaDePacientesEnEquipo().add(paciente);
	}

	private void inicializarEquiposMedicos() {
		for (int i = 0; i < this.equiposMedicos.length; i++) {
			this.equiposMedicos[i] = new EquipoMedico(i+1);
		}
	}

	public ColaPacientes getColaDePacientesEnEspera() {
		return colaDePacientesEnEspera;
	}

	public void setColaDePacientesEnEspera(ColaPacientes colaDePacientesEnEspera) {
		this.colaDePacientesEnEspera = colaDePacientesEnEspera;
	}

	public EquipoMedico[] getEquiposMedicos() {
		return equiposMedicos;
	}

	public void setEquiposMedicos(EquipoMedico[] equiposMedicos) {
		this.equiposMedicos = equiposMedicos;
	}
	
	public void agregarPacientes(Paciente p) {
		this.colaDePacientesEnEspera.add(p);
	}

	@Override
	public String toString() {
		return "Hospital [colaDePacientesEnEspera=" + colaDePacientesEnEspera + ", equiposMedicos="
				+ Arrays.toString(equiposMedicos) + ", CANT_EQUIP_MEDICOS=" + CANT_EQUIP_MEDICOS + "]";
	}
	
	
	
}
