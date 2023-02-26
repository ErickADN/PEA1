package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Cine;
import bean.Pelicula;


public class daoCine {
	 db.dB db= new db.dB("mysql8003.site4now.net","a95010_cinesta","cinestar1234","db_a95010_cinesta");
	 public String[][] getVerCines() {		 
		 	db.Sentencia(String.format("call sp_getCines()"));
			return db.getRegistros();
	    }
	 
	 public Object getVerCines(boolean bLista) {
			
			db.Sentencia(String.format("call sp_getCines()"));
			String[][] cines = db.getRegistros();
			
			if(cines==null) return null;
			if(!bLista) return cines;
			
			List<Cine> lstCine = new ArrayList<>();
			for(String[] cine : cines)
				lstCine.add(new Cine(cine));
			return lstCine;
		}


	public Object getCineTarifas(Object id,boolean bLista) {
		db.Sentencia(String.format("call sp_getCineTarifas(%s)",id));
		String[][] cinestarifas = db.getRegistros();	
		if(cinestarifas==null) return null;
		if(!bLista) return cinestarifas;
		
		List<Cine> lstCinetarifas = new ArrayList<>();
		for(String[] cinetarifa : cinestarifas)
			lstCinetarifas.add(new Cine(cinetarifa));
		return lstCinetarifas;
	}

	public Object getCinePeliculas(Object id,boolean bLista) {
		db.Sentencia(String.format("call sp_getCinePeliculas(%s)",id));
		String[][] cinespeliculas = db.getRegistros();	
		if(cinespeliculas==null) return null;
		if(!bLista) return cinespeliculas;
		
		List<Cine> lstCinepeliculas = new ArrayList<>();
		for(String[] cinespelicula : cinespeliculas)
			lstCinepeliculas.add(new Cine(cinespelicula));
		return lstCinepeliculas;
	}

	public Object getVerCine(String id,boolean bEntidad) {
		db.Sentencia(String.format("call sp_getCine(%s)",id));
		String[] aRegistro = db.getRegistro();	
		if(aRegistro==null) return null;
		if(!bEntidad) return aRegistro;	
		return new Cine (aRegistro);
	}

	
}
