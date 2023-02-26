package bean;



public class cineTarifa {
	String precio;
	String diasemana;
	
	
	
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDiasemana() {
		return diasemana;
	}
	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}
	public cineTarifa() {
		
	}
	public cineTarifa(String[] aRegistro) {
		if(aRegistro==null) return;
		diasemana =aRegistro[0];
		precio = aRegistro[1];
		
	}
}
