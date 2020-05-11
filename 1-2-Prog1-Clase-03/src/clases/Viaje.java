package clases;

public class Viaje {

	private Double kmsViaje;
	private Integer idCamion;
	private String idChofer;
	
	
	
	public Viaje(Double kmsViaje, Integer idCamion, String idChofer) {
		super();
		this.kmsViaje = kmsViaje;
		this.idCamion = idCamion;
		this.idChofer = idChofer;
	}
	public Double getKmsViaje() {
		return kmsViaje;
	}
	public void setKmsViaje(Double
			kmsViaje) {
		this.kmsViaje = kmsViaje;
	}
	public Integer getIdCamion() {
		return idCamion;
	}
	public void setIdCamion(Integer idCamion) {
		this.idCamion = idCamion;
	}
	public String getIdChofer() {
		return idChofer;
	}
	public void setIdChofer(String idChofer) {
		this.idChofer = idChofer;
	}
	
	
	
	
}
