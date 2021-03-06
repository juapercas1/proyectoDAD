package vertx;

public class Elementos {

	private String idElemento;
	private String idWifiElem;
	private String estado;

	public Elementos(){
		this("","", "0");
	}
	
	// Constructor con parámetros
	public Elementos(String idElemento, String idWifiElem, String estado) {
		super();
		this.idElemento = idElemento;
		this.idWifiElem = idWifiElem;
		this.estado = estado;
	}
	

	// Guetters and Setters
	public String getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(String idElemento) {
		this.idElemento = idElemento;
	}

	public String getIdWifiElem() {
		return idWifiElem;
	}

	public void setIdWifiElem(String idWifiElem) {
		this.idWifiElem = idWifiElem;
	}

	public String isEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((idElemento == null) ? 0 : idElemento.hashCode());
		result = prime * result + ((idWifiElem == null) ? 0 : idWifiElem.hashCode());
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
		Elementos other = (Elementos) obj;
		if (estado != other.estado)
			return false;
		if (idElemento == null) {
			if (other.idElemento != null)
				return false;
		} else if (!idElemento.equals(other.idElemento))
			return false;
		if (idWifiElem == null) {
			if (other.idWifiElem != null)
				return false;
		} else if (!idWifiElem.equals(other.idWifiElem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Elementos [idElemento=" + idElemento + ", idWifiElem=" + idWifiElem + ", estado=" + estado + "]";
	}
	
	

}
