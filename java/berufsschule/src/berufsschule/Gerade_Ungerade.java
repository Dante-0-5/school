package berufsschule;

import java.util.Scanner;

public class Gerade_Ungerade {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive, whole number:");
		int number = scan.nextInt();
		
		int even_odd = number%2;
		
		if (even_odd == 0) {
			System.out.println("Number is even!");
		} else if (even_odd == 1) {
			System.out.println("Number is odd!");
		}
	}

}
