package arrays;

public class EindimensionaleArrays {
	public static void main (String [] args) {
		int zahl = 3;
		
		int[] feld = new int[7]; //generiert ein neues array mit 7 Indizies, ansprechbar mit [0] - [6]
		feld[3] = 20; //gibt dem vierten Index den Wert 20
		
		System.out.println(feld[3]); //gibt '20' aus
		
		System.out.println(feld[1]); //gibt '0' aus. Anders als bei anderen Variablen geben nicht
									 //definierte Array-Indizies nicht 'null' aus. Bei der Erstellung
									 //(vgl. Zeile 7) werden alle Indizies mit einem Standardwert
									 //vorbelegt (im Falle int ist dieser Wert 0)
	}

}
