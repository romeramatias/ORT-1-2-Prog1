package edu.ort.prog1.clase01.clases;

public class Jugador {

	private Integer intEdad;
	private Integer intNumero;
	private String stringApellido;
	private Boolean booleanEsTitular;
	private Enum<PiernaHabil> enumPiernaHabil;
	private Enum<Posicion> enumPosicion;

	final private Integer MIN_NUMERO = 1;
	final private Integer MAX_NUMERO = 99;

	public Jugador(Integer intEdad, Integer intNumero, String stringApellido, Boolean booleanEsTitular,
			Enum<PiernaHabil> enumPiernaHabil, Enum<Posicion> enumPosicion) {
		super();
		this.intEdad = intEdad;
		this.intNumero = intNumero;
		this.stringApellido = stringApellido;
		this.booleanEsTitular = booleanEsTitular;
		this.enumPiernaHabil = enumPiernaHabil;
		this.enumPosicion = enumPosicion;
		
	}

	@Override
	public String toString() {
		return "Jugador [intEdad=" + intEdad + ", intNumero=" + intNumero + ", stringApellido=" + stringApellido
				+ ", booleanEsTitular=" + booleanEsTitular + ", enumPiernaHabil=" + enumPiernaHabil + ", enumPosicion="
				+ enumPosicion + "]";
	}

	public Integer getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(Integer intEdad) {
		this.intEdad = intEdad;
	}

	public Integer getIntNumero() {
		return intNumero;
	}

	public void setIntNumero(Integer intNumero) {
		if (intNumero <= MAX_NUMERO && intNumero >= MIN_NUMERO) {
			this.intNumero = intNumero;
		}
	}

	public String getStringApellido() {
		return stringApellido;
	}

	public void setStringApellido(String stringApellido) {
		this.stringApellido = stringApellido;
	}

	public Boolean getBooleanEsTitular() {
		return booleanEsTitular;
	}

	public void setBooleanEsTitular(Boolean booleanEsTitular) {
		this.booleanEsTitular = booleanEsTitular;
	}

	public Enum<PiernaHabil> getEnumPiernaHabil() {
		return enumPiernaHabil;
	}

	public void setEnumPiernaHabil(Enum<PiernaHabil> enumPiernaHabil) {
		this.enumPiernaHabil = enumPiernaHabil;
	}

	public Enum<Posicion> getEnumPosicion() {
		return enumPosicion;
	}

	public void setEnumPosicion(Enum<Posicion> enumPosicion) {
		this.enumPosicion = enumPosicion;
	}
	
}
