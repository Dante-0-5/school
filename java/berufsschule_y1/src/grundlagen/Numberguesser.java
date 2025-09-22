package grundlagen;

import java.util.Scanner;
import java.lang.Math;

public class Numberguesser {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int scrt_nr = (int) (Math.random() * 10) + 1;
		int guess = 0;
		int guesses_total = 1;
		
		do {
			System.out.println("Enter your guess:");
			guess = scan.nextInt();
			
			if (guess != scrt_nr) {
				System.out.println("Sorry, that was incorrect. Try again.");
				guesses_total++;
			}
		} while (guess != scrt_nr);
		
		System.out.println("Congratulations! You guessed correctly!\nIt took you " + guesses_total + " guesses to guess correctly.");
	}

}
