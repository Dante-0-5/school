package hangman;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class Word {
	public static String choose() {
		//generates a random number, uses it to pick a random word from the array, and returns the word as a String
		String[] dictionary = {"APFEL", "BIRNE", "KIRSCHE"};
		int dictIndex = (int) (Math.random()*dictionary.length);
		
		String word = dictionary[dictIndex];
				
		return word;
	}
	
	public static ArrayList<String> makeWordBlank(String secretWord) {
		//creates the "blank" (the lines that show how long the word is)
		int wordLength = secretWord.length();
		ArrayList<String> wordBlank = new ArrayList<String>();
		for (int i = 0; i < wordLength; i++) {
			wordBlank.add("_");
		}
		
		return wordBlank;
	}
	
	public static ArrayList<String> getIndex(String secretWord, String guess) {
		//checks whether the secret word contains the players guess. If yes, returns the indexes of the guess in an ArrayList. If no, returns an empty ArrayList.
		secretWord = secretWord.toUpperCase();
		guess = guess.toUpperCase();
		
		if (secretWord.contains(guess)) {
			ArrayList<String> indexArray = new ArrayList<String>();
			for (int index = secretWord.indexOf(guess); index >= 0; index = secretWord.indexOf(guess, index + 1)) {
				indexArray.add(String.valueOf(index));
			} return indexArray;
			
		} else {
			ArrayList<String> foobar = new ArrayList<String>();
			return foobar;
		}
	}

}
