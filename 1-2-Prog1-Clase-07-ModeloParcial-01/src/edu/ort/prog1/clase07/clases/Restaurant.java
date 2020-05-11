package edu.ort.prog1.clase07.clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

	private Gerente gerente;
	private Mozo[] mozos;
	private ArrayList<Chef> chefs;
	private ArrayList<Cocinero> cocineros;
	private Menu menu;
	private ArrayList<Pedido> pedidos;
	private Mesa[] mesas;

//	public void pedidosPorCocinero(int numLegajo) {
//		Empleado e = buscarEmpleadoPorLegajo(int numLegajo);
//			if(e != null && e instanceof Cocinero) {
//				System.out.println("Pedidos de " + e.getNombre());
//				for (Pedido p : this.pedidos) {
//					
//					if (p.getCocinero().equals(e)) {
//						p.mostrar();
//					}
//		}
//		} else {
//			System.out.println("Cocinero no encontrado");
//		}
//	}

	
	public void pedidosPorCocinero(int numLegajo) {
		for (Pedido pedido : this.pedidos) {
			if (pedido.getCocinero().getNumLegajo() == numLegajo) {
				System.out.println("Pedidos del cocinero");
				pedido.toString();
			} else {
				System.out.println("Cocinero sin pedidos");
			}
		}
	}
	
	public void liberarMesa (int numMesa) {
		double sum = 0;
		
		for (Pedido pedido : pedidos) {
			if (pedido.getMesa().getNumDeMesa() == numMesa) {
				sum += pedido.importeAPagar();
			}
		}
		
		if (sum != 0) {
			System.out.println("Importe a pagar: " + sum);
			this.mesas[numMesa].liberar();
		} else {
			System.out.println("La mesa no realizo pedidos");
		}
		
		
	}

//	public void liberarMesaint(int numMesa) {
//		double sumatoria = 0;
//		for (Pedido p : this.pedidos) {
//			if (p.getNumMesa() == numMesa) {
//				sumatoria += p.importeAPagar();
//			}
//		}
//
//		if (sumatoria != 0) {
//			System.out.print("Importe a pagar " + sumatoria);
//			this.mesas[numMesa].liberar();
//		} else {
//			System.out.println("No hay pedidos para la mesa");
//		}

	

	public void informarCanPedidos() {
		int[][] matriz = new int[this.mozos.length][this.mesas.length];
	
		for (Pedido p : pedidos) {
			int numMesa = p.getMesa().getNumDeMesa();
			Mozo m = p.getMozo();
			int numMozo = numeroDeMozo(m);
			matriz[numMozo][numMesa]++;
		}
		mostrarMatriz(matriz);
		
	}
	
	private void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
	
	private int numeroDeMozo(Mozo m) {
		int pos = -1;
		int index = 0;
		
		while (index < this.mozos.length && pos != -1) {
			if (this.mozos[index].equals(m)) {
				pos = index;
			} else {
				index++;
			}
		}
		
		return pos;
	}
	
	// Metodos de siempre
	public Restaurant(Gerente gerente, Mozo[] mozos, ArrayList<Chef> chefs, ArrayList<Cocinero> cocineros, Menu menu,
		ArrayList<Pedido> pedidos, Mesa[] mesas) {
	super();
	this.gerente = gerente;
	this.mozos = mozos;
	this.chefs = chefs;
	this.cocineros = cocineros;
	this.menu = menu;
	this.pedidos = pedidos;
	this.mesas = mesas;
}

	@Override
	public String toString() {
		return "Restaurant [gerente=" + gerente + ", mozos=" + Arrays.toString(mozos) + ", chefs=" + chefs
				+ ", cocineros=" + cocineros + ", menu=" + menu + ", pedidos=" + pedidos + ", mesas="
				+ Arrays.toString(mesas) + "]";
	}

	public void agregarChef(String nombre, int numLegajo, String fechaIngreso, String titulo) {
		Chef c = new Chef(nombre, numLegajo, fechaIngreso, titulo);
		this.chefs.add(c);
	}
	
	public void agregarChef(String nombre, int numLegajo, String fechaIngreso) {
		this.agregarChef(nombre, numLegajo, fechaIngreso, "");
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Mozo[] getMozos() {
		return mozos;
	}

	public void setMozos(Mozo[] mozos) {
		this.mozos = mozos;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public ArrayList<Cocinero> getCocineros() {
		return cocineros;
	}

	public void setCocineros(ArrayList<Cocinero> cocineros) {
		this.cocineros = cocineros;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Mesa[] getMesas() {
		return mesas;
	}

	public void setMesas(Mesa[] mesas) {
		this.mesas = mesas;
	}
	
}
