package it.corso.java;


import it.corso.java.database.EsempioDatabase;

public class CorsoJava {

	public static void main(String[] args) {
	
		System.out.println("ciao");
		EsempioDatabase db = new EsempioDatabase();
		db.getConnection();
		try {
			
			db.elencoTag();
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	}

}
