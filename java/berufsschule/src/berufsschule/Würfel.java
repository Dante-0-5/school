package berufsschule;

import java.lang.Math;
import java.util.Scanner;

public class Würfel {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		short i = 0;
		short wins = 0;
		
		while (i <= 9) {
			System.out.println("Press enter to roll the dice!");
			scan.nextLine();
			
			int würfel = (int) (Math.random()*6)+1;
			if (würfel == 6) {
				System.out.println("Congratulations! You win! You rolled a " + würfel + ". " + (9 - i) + " attempts remain.");
				wins++;
			} else {
				System.out.println("Sorry, no win. You rolled a " + würfel + ". " + (9 - i) + " attempts remain.");
				
			}
			
			i++;
		}
		
		System.out.println("\nYou achieved " + wins + " win(s).");
	}

}
