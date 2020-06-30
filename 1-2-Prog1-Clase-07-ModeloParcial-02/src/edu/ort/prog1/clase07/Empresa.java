/** @author romeramatias 
 */
package edu.ort.prog1.clase07;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Pedido> pedidos;
	private ArrayList<Empleado> empleados;
	private ArrayList<Articulo> articulos;
	private ArrayList<Cliente> cliente;

	
	private double ventasPorVendedorPorMes(Empleado empleado, int anio, int mes) {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos = obtenerPedidosPorVendedor((EmpleadoVendedor) empleado);
		double totalVentas = 0;
		
		for (Pedido pedido : pedidos) {
			if (pedido.esAnioMes(anio, mes)) {
				totalVentas += pedido.totalPedido();
			}
		}
		
		return totalVentas;
	}
	
	public double costoTotal(int anio, int mes) {
		double costo = 0;
		
		for (Empleado e : this.empleados) {
			if (e instanceof EmpleadoVendedor) {
				double totalVentas = ventasPorVendedorPorMes(e, anio, mes);
				double plus = totalVentas * e.getPlus() / 100;
				costo += e.getSueldo() + plus;
				if (e.esSenior()) {
					costo += Empleado.getPlusSenior();
				}
			} else {
				double plus = e.getSueldo() * e.getPlus() / 100;		
				costo += e.getSueldo() + plus;
				if (e.esSenior()) {
					costo += Empleado.getPlusSenior();
				}
			}		
		}
		
		return costo;
		
	}

	private ArrayList<Pedido> obtenerPedidosPorVendedor(EmpleadoVendedor vendedor){
		ArrayList<Pedido> pedidosDeVendedor = new ArrayList<Pedido>();
		
		for (Pedido p : this.pedidos) {
			if (p.getVendedor().equals(vendedor)) {
				pedidosDeVendedor.add(p);
			}
		}
		
		return pedidosDeVendedor;
	}
	
}
