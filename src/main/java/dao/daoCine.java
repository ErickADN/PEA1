package dao;

public class daoCine {
	 db.dB db= new db.dB("mysql8003.site4now.net","a95010_cinesta","cinestar1234","db_a95010_cinesta");
	 public String[][] getVerCines() {		 
		 	db.Sentencia(String.format("call sp_getCines()"));
			return db.getRegistros();
	    }
}
