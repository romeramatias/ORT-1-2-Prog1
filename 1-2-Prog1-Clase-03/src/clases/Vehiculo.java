package clases;

public class Vehiculo {

	private Integer id;
	private Double gastoPromedioKm;
	
	public Vehiculo(Integer id, Double gastoPromedioKm) {
		super();
		this.id = id;
		this.gastoPromedioKm = gastoPromedioKm;
	}
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", gastoPromedioKm=" + gastoPromedioKm + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getGastoPromedioKm() {
		return gastoPromedioKm;
	}
	public void setGastoPromedioKm(Double gastoPromedioKm) {
		this.gastoPromedioKm = gastoPromedioKm;
	}
	
	
}
