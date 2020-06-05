package test;

import java.util.Arrays;

public class Frigorific {

	Vendedor[] vendedores;

	public Frigorific() {
		super();
		this.vendedores = new Vendedor[5];
		this.vendedores[0] = new Vendedor("Juan", 10000);
		this.vendedores[1] = new Vendedor("Jose", 14000);
		this.vendedores[3] = new Vendedor("Jorge", 13000);
		this.vendedores[4] = new Vendedor("Dani", 11000);
	}

	
	public double costoTotal() {
		double sum = 0;
		for (Vendedor vendedor : vendedores) {
			if (vendedor != null) {
				sum += vendedor.getSueldo();	
			}
			
		}
		return sum;
	}
	
	public Vendedor[] getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	@Override
	public String toString() {
		return "Frigorific [vendedores=" + Arrays.toString(vendedores) + "]";
	}
	

	
	
}
