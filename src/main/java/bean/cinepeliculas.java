package bean;

public class cinepeliculas {
	String titulos;
	String horaio;
	
	
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getHoraio() {
		return horaio;
	}
	public void setHoraio(String horaio) {
		this.horaio = horaio;
	}
	
	public cinepeliculas() {
		
	}
	public cinepeliculas(String[] aRegistro) {
		if(aRegistro==null) return;
		titulos=aRegistro[0];
		horaio = aRegistro[1];
		
	}
}
