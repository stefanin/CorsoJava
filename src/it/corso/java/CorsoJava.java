/*
 * CorsoJava 05 02 2021
 * @author Stefano Cornelli
 * 
 */
package it.corso.java;


import it.corso.java.database.EsempioDatabase;

public class CorsoJava {

	public static void main(String[] args) {
		/*
		 * Commento javaDoc
		 */
		
		/* commento javadoc */
	
		System.out.println("--------------------------------------------------------");
		Calcolatrice c = new Calcolatrice();
		double a = 10;
		double b = 15.5;
		System.out.println(c.somma(a, b));
		
		EsempioDatabase db = new EsempioDatabase();
		db.getConnection();
		try {
			
			db.elencoTag();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		UsareLeStringhe St = new UsareLeStringhe();
		St.Esempio();

	
	

	}

}
