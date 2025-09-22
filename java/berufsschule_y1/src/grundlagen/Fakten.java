package grundlagen;

import java.util.Scanner;

public class Fakten {
	public static void main (String [] args) {
		//Wenn mit zwei Integern gerechnet wird, kommt immer ein Integer heraus:
		int zahl1 = 2;
		int zahl2 = 3;
		
		double zahl3 = zahl1/zahl2;
		System.out.println(zahl3);
		//Hier wird 0.0 ausgegeben. Bei der Division von zahl1 und zahl2 kommt 0.66666... heraus. 
		//Bei der vorläufigen Speicherung als Integer wird die Zahl "abgeschnitten", und nur 0 wird gespeichert.
		
		//Zu Objekten:
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = scan;
		//Hier ist scan2 ein exakter Klon von scan.
	}

}
