package berufsschule;

public class VariablenUndDatentypen {
	public static void main (String [] args) {
		
		//Deklaration
		int zahl1;
		int zahl2;
		int ergebnis;
		
		//Initialisierung
		zahl1 = 1;
		zahl2 = 2;
		ergebnis = 0;
		
		//Deklaration und Initialisierung im selben Schritt
		int zahl3 = 0;
		
		//Datentypen:
		
		//boolean hält "true" oder "false"
		boolean bool = true;
		
		//char hält einen einzelnen Character
		char character = 'A';
		//Einzelne Anführungszeichen sind wichtig!
		
		//byte hält ganze Zahlen von -128 - 127 (Inklusive 0!)
		byte byte1 = 0;
		
		//short hält ganze Zahlen von -32768 - 32767
		short short1 = 0;
		
		//int hält ganze Zahlen von -2147483648 - 2147483647
		int integer = 0;
		
		//long hält ganze Zahlen von -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
		long long1 = 0;
		
		//float hält Dezialzahlen variabler Länge. Es braucht weniger Speicher als double (32 Bit), ist aber weniger genau
		float float1 = 1.23f;
		
		//double hält Dezimalzahlen variabler Länge. Es braucht mehr Speicher als float (64 Bit, doppelt so viel), ist aber genauer
		double double1 = 4.56;
	}
}
