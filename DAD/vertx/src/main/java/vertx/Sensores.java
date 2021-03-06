package vertx;

public class Sensores {
	private String idSensor;
	private String tipoSensor;
	private String descripcion;
	private String idWifi;

	// Constructor vacio
	public Sensores() {
		this("", "", "", "");
	}

	// Constructor con parámetros
	public Sensores(String idSensor, String tipoSensor, String descripcion, String idWifi) {
		super();
		this.idSensor = idSensor;
		this.tipoSensor = tipoSensor;
		this.descripcion = descripcion;
		this.idWifi = idWifi;
	}

	// Métodos guetters and Setters
	public String getIdSensor() {
		return idSensor;
	}

	public void setIdSensor(String idSensor) {
		this.idSensor = idSensor;
	}

	public String getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(String tipoSensor) {
		this.tipoSensor = tipoSensor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdWifi() {
		return idWifi;
	}

	public void setIdWifi(String idWifi) {
		this.idWifi = idWifi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((idSensor == null) ? 0 : idSensor.hashCode());
		result = prime * result + ((idWifi == null) ? 0 : idWifi.hashCode());
		result = prime * result + ((tipoSensor == null) ? 0 : tipoSensor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensores other = (Sensores) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idSensor == null) {
			if (other.idSensor != null)
				return false;
		} else if (!idSensor.equals(other.idSensor))
			return false;
		if (idWifi == null) {
			if (other.idWifi != null)
				return false;
		} else if (!idWifi.equals(other.idWifi))
			return false;
		if (tipoSensor == null) {
			if (other.tipoSensor != null)
				return false;
		} else if (!tipoSensor.equals(other.tipoSensor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sensores [idSensor=" + idSensor + ", tipoSensor=" + tipoSensor + ", descripcion=" + descripcion
				+ ", idWifi=" + idWifi + "]";
	}

}
