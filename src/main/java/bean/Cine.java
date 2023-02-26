package bean;

public class Cine {
	int id,salas,idDistrito;
	String RazonSocial,Direccion,Telefonos,Detalle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalas() {
		return salas;
	}
	public void setSalas(int salas) {
		this.salas = salas;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefonos() {
		return Telefonos;
	}
	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}
	
	
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	public Cine() {
		
	}
	public Cine(String[] aRegistro) {
		if(aRegistro==null) return;
		id  =Integer.parseInt(aRegistro[0]);
		RazonSocial = aRegistro[1];
		salas  =Integer.parseInt(aRegistro[2]);
		idDistrito  =Integer.parseInt(aRegistro[3]);
		Direccion = aRegistro[4];
		Telefonos = aRegistro[5];
		Detalle=aRegistro[6];
	}
}
