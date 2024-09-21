package hiLo;

import java.lang.Math;
import java.util.Scanner;

public class HiLo {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
			int ScrtNr = (int) (Math.random() * 100 + 1);
			int attempts = 1;
			
			System.out.println("Pick a number between 1 and 100:");
			int guess = scan.nextInt();
			
			if (guess != ScrtNr) {
				while (guess != ScrtNr) {
					if (guess < ScrtNr) {
						System.out.println("Too low! Try again.");
						++attempts;
						guess = scan.nextInt();
					} else if (guess > ScrtNr) {
						System.out.println("Too high! Try again.");
						++attempts;
						guess = scan.nextInt();
					}
				}
			} else {
				System.out.println("First try! Not bad!");
			}
			
			System.out.println("Well done! You guessed correctly!");
			System.out.println("It took you " + attempts + " attempts to guess correctly.");
			
	}

}
