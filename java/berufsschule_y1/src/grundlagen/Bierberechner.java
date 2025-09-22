package grundlagen;

import java.util.Scanner;

public class Bierberechner {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bierflaschen-Verteilungsrechner v.1. Geben Sie die Menge der Bierflaschen ein:");
		int flaschen = scan.nextInt();
		
		System.out.println("Geben Sie die Größe der Kästen ein:");
		int kasten = scan.nextInt();
		
		int kastenVoll = flaschen/kasten;
		int flaschenRest = flaschen%kasten;
		
		System.out.println(kastenVoll + " Kästen können vollständig befüllt werden. " + flaschenRest + " Flaschen bleiben übrig.");
	}

}
