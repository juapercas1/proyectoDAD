package vertx;

public class Elementos {

	private String idElemento;
	private String idWifi;
	private boolean estado;

	public Elementos(){
		this("","", false);
	}
	
	// Constructor con par�metros
	public Elementos(String idElemento, String idWifi, boolean estado) {
		super();
		this.idElemento = idElemento;
		this.idWifi = idWifi;
		this.estado = estado;
	}

	// Guetters and Setters
	public String getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(String idElemento) {
		this.idElemento = idElemento;
	}

	public String getIdWifi() {
		return idWifi;
	}

	public void setIdWifi(String idWifi) {
		this.idWifi = idWifi;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (estado ? 1231 : 1237);
		result = prime * result + ((idElemento == null) ? 0 : idElemento.hashCode());
		result = prime * result + ((idWifi == null) ? 0 : idWifi.hashCode());
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
		if (idWifi == null) {
			if (other.idWifi != null)
				return false;
		} else if (!idWifi.equals(other.idWifi))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Elementos [idElemento=" + idElemento + ", idWifi=" + idWifi + ", estado=" + estado + "]";
	}
	
	

}