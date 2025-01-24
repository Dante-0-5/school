package hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void hangman () throws IOException {
		Scanner scanHangman = new Scanner(System.in);
		int gameState = 0;
		String guess = "";
		ArrayList<String> arrayIndex;
		String endCase = "";
		ArrayList<String> lettersTried = new ArrayList<String>();
		
		String secretWord = Word.choose();
		ArrayList<String> secretWordArrayList = new ArrayList<>(Arrays.asList(secretWord.split("")));
		ArrayList<String> wordBlankArray = Word.makeWordBlank(secretWord);
		String wordBlankString = String.join(" ", wordBlankArray);
		//Generates the four main values
		
		Screen.drawUI(false);
		Screen.hangmanDraw(0);
		
		System.out.println("\n" + wordBlankString + "\n");
		System.out.println("Letters tried: \n");
		System.out.println("Make your first guess!");
		
		while (gameState != 9) {
			guess = scanHangman.nextLine();
			
			arrayIndex = Word.getIndex(secretWord, guess);
			for(int i = 0; i < arrayIndex.size(); i++) {
				//This for loop iterates through arrayIndex. Each entry has the index of secretWordArrayList
				//at which a correctly guessed letter exists. For each loop, it writes the correct letter
				//(retrieved from secretWordArrayList using its position from arrayIndex) into wordBlankUncovered,
				//and terminates once the end of arrayList is reached.
				wordBlankArray.set(Integer.valueOf(arrayIndex.get(i)), secretWordArrayList.get(Integer.valueOf(arrayIndex.get(i))));
			}
			
			if (arrayIndex.isEmpty()) {
				gameState++;
				if (gameState == 9) {
					endCase = "lose";
					break;
				}
				wordBlankString = String.join(" ", wordBlankArray);
				lettersTried.add(guess);
				
				Screen.drawUI(false);
				Screen.hangmanDraw(gameState);
				System.out.println("\n" + wordBlankString + "\n");
				System.out.println("Letters tried: " + String.join(", ", lettersTried));
				System.out.println("\nSorry, that was incorrect! Guess again.");
			} else {
				if (wordBlankArray.contains("_") == false) {
					endCase = "win";
					break;
				}
				wordBlankString = String.join(" ", wordBlankArray);
				
				Screen.drawUI(false);
				Screen.hangmanDraw(gameState);
				System.out.println("\n" + wordBlankString + "\n");
				System.out.println("Letters tried: " + String.join(", ", lettersTried));
				System.out.println("\nGood show! Keep it up!");
			}
			
		}
		
		if (endCase == "lose") {
			Screen.drawUI(true);
			Screen.hangmanDraw(9);
			wordBlankString = String.join(" ", wordBlankArray);
			System.out.println("\n" + wordBlankString + "\n");
			System.out.println("Sorry, you lost. You were looking for " + secretWord + ".");
			scanHangman.nextLine();
		} else {
			Screen.drawUI(false);
			Screen.hangmanDraw(gameState);
			wordBlankString = String.join(" ", wordBlankArray);
			System.out.println("\n" + wordBlankString + "\n");
			System.out.println("Congratulations! You won!");
			scanHangman.nextLine();
		}
		
	}

}
