package grundlagen;

import java.util.Scanner;
import java.lang.Math;

public class Würfel_For_Loop {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int dice = 0;
		short wins = 0;
		
		for (short i = 1; i < 11; i++) {
			System.out.print("Attempt " + i + " of 10. Press enter to roll the dice.");
			scan.nextLine();
			
			dice = (int) (Math.random()*6)+1;
			
			if (dice == 6) {
				System.out.println("Congratulations! You rolled a 6!\n");
				wins++;
			} else {
				System.out.println("Sorry, no win. You rolled a " + dice + ".\n");
			}
		}
		
		System.out.println("Game over.\nYour total wins: " + wins + "\nYour total losses: " + (10-wins));
	}

}
