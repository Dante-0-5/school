package berufsschule;

import java.util.Scanner;

public class Verzweigungen_Tresor {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int pin = 0;
		
		System.out.println("Safe locked. Enter PIN:");
		
		do {
			pin = scan.nextInt();
			
			if (pin == 615243) {
				System.out.println("PIN correct!");
			} else {
				System.out.println("PIN incorrect! Try again.");
			}
		} while (pin != 615243);
		
		System.out.println("PIN confirmed: Safe unlocked.");
	}

}
