package it.corso.java;

public class UsareLeStringhe {
	/**
	 * alcuni esempi di utilizzo delle stringhe
	 * <a href="https://github.com/stefanin/CorsoJava/blob/main/src/it/corso/java/UsareLeStringhe.java" > clicca per vedere gli esempi </a>
	 */
	public void Esempio() {
		String S1 = "prima stringa"; //creo una stringa
		String S2 = "Seconda stringa";
		System.out.println(S1+S2); // concatena
		System.out.println(S2.concat(S1)); // concatena
		System.out.println("upper case".toUpperCase()); // Uppercase
		System.out.println("uppercase e replace non funziona".toUpperCase().replaceAll("p","9")); // Uppercase
		System.out.println("uppercase e replace funziona".toUpperCase().replaceAll("P","9")); // Uppercase
		System.out.println("uppercase e replace ed estrae dopo le prime 4".toUpperCase().replaceAll("P","9").substring(4)); // Uppercase
	
		
	}

}
