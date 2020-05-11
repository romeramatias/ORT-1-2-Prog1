package edu.ort.prog1.clase09.clases;

public class Pelota {

	private String codigo;
	private TipoPelota tipo;
	
	
	public Pelota(String codigo, TipoPelota tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public TipoPelota getTipo() {
		return tipo;
	}
	public void setTipo(TipoPelota tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Pelota [codigo=" + codigo + ", tipo=" + tipo + "]";
	}
	
	
}
