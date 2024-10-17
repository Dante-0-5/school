package berufsschule;

import java.util.Scanner;

public class ECPrüfziffer {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("Prüfzifferrechner v.1. ");
		
		for (int i = 1; i < 5; i++) { //for-loop
			System.out.printf("Geben Sie die %d. Nummer ein: ", i); //Formatierter String. %d wird ersetzt durch i.
			sum += scan.nextInt(); //Dasselbe wie: sum = sum + scan.nextInt()
		}
		
		int kenn = sum%3;
		System.out.println("Kennziffer: " + kenn);
	}

}
