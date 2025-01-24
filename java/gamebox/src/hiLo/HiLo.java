package hiLo;

import java.lang.Math;
import java.util.Scanner;

public class HiLo {
	public static void hiLo () {
		
		Scanner numberScan = new Scanner(System.in);
		Scanner stringScan = new Scanner(System.in);
		
		String playAgain = "y";
		int attempts = 1;
		int ScrtNr = 0;
		
		do {
			ScrtNr = (int) (Math.random() * 100 + 1);
			
			System.out.println("Pick a number between 1 and 100:");
			int guess = numberScan.nextInt();
			
			if (guess != ScrtNr) {
				while (guess != ScrtNr) {
					if (guess < ScrtNr) {
						System.out.println("Too low! Try again.");
						++attempts;
						guess = numberScan.nextInt();
					} else if (guess > ScrtNr) {
						System.out.println("Too high! Try again.");
						++attempts;
						guess = numberScan.nextInt();
					}
				}
			} else {
				System.out.println("First try! Not bad!");
			}
			
			System.out.println("Well done! You guessed correctly!");
			System.out.println("It took you " + attempts + " attempts to guess correctly.");
			System.out.println("Would you like to play again? (Y/N)");
			
			playAgain = stringScan.next();
			
		} while (playAgain.equalsIgnoreCase("y"));
			
	}

}
