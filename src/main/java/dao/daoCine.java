package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Cine;


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

	/*public String[] getVerCine(Object idCine) {
		db.Sentencia(String.format("call sp_getCine()"));
		return db.getRegistros();
	}*/

	public Object getCineTarifas(Object idCine) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCinePeliculas(Object idCine) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
