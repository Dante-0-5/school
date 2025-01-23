package diceroll;

import java.lang.Math;
import java.util.Scanner;

public class Wüfel_infinite {
	public static void diceroll() {
		Scanner scan = new Scanner(System.in);
		int diceroll;
		int wins = 0;
		
		do {
			System.out.print("Press enter to roll the dice!");
			scan.nextLine();
			
			diceroll = (int) (Math.random() * 6) + 1;
			
			if (diceroll == 6) {
				System.out.println("Congratulations! You win!\n");
				wins++;
			}
		} while (diceroll == 6);
		
		System.out.println("Sorry, that was it for you. You won " + wins + " times.");
		scan.close();
	}

}
