package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) throws IOException {
		boolean exit = false;
		int game = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (exit != true) {
			System.out.println("Welcome to the gamebox! Pick a game to play by entering a number:\n"
					+ "1: Hangman\n"
					+ "2: Higher or Lower?\n"
					+ "3: Numberguesser\n"
					+ "4: Diceroll\n"
					+ "\n5: Exit");
			
			game = scan.nextInt();
			
			switch (game) {
			case 1:
				hangman.Main.hangman();
				break;
			case 2:
				hiLo.HiLo.hiLo();
				break;
			case 3:
				numberguesser.Numberguesser.numberguesser();
				break;
			case 4:
				diceroll.Wüfel_infinite.diceroll();
				break;
			case 5:
				exit = true;
				break;
			}
			
		}
		
		scan.close();
	}

}
