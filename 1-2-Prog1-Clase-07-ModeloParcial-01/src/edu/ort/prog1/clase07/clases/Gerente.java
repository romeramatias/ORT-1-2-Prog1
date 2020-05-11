package edu.ort.prog1.clase07.clases;

public class Gerente extends EmpleadoGremio {

	private int personasCargo;

	//
	public Gerente(String nombre, int numLegajo, String fechaIngreso, String horarioEntrada, String horarioSalida,
			int personasCargo) {
		super(nombre, numLegajo, fechaIngreso, horarioEntrada, horarioSalida);
		this.personasCargo = personasCargo;
	}

	@Override
	public String toString() {
		return "Gerente [personasCargo=" + personasCargo + "]";
	}

	public int getPersonasCargo() {
		return personasCargo;
	}

	public void setPersonasCargo(int personasCargo) {
		this.personasCargo = personasCargo;
	}
	
	
}
