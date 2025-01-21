package hangman;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main (String [] args) {
		String secretWord = "NOMENCLATURE"; 
		
		ArrayList<String> secretWordArrayList = new ArrayList<>(Arrays.asList("NOMENCLATURE".split("")));
		
		ArrayList<String> wordBlankArray = Word.makeWordBlank(secretWord);
		String wordBlank = String.join(" ", wordBlankArray);
		
		ArrayList<String> wordBlankUncovered = wordBlankArray;
		String wordBlankUncoveredString = String.join(" ", wordBlankUncovered);
		
		ArrayList<String> arrayIndex = Word.getIndex(secretWord, "E");
		
		System.out.println(secretWordArrayList);
		
		//replace the positions passed over using arrayIndex in wordBlankUncovered with the positions from secretWordArrayList
		
		for(int i = 0; i < arrayIndex.size(); i++) {
			//This for loop iterates through arrayIndex. Each entry has the index of secretWordArrayList,
			//at which a correctly guessed letter exists. For each loop, it writes the correct letter
			//(retrieved from secretWordArrayList using its position from arrayIndex) into wordBlankUncovered.
			wordBlankUncovered.set(Integer.valueOf(arrayIndex.get(i)), secretWordArrayList.get(Integer.valueOf(arrayIndex.get(i))));
		}
		
		System.out.println(wordBlankUncovered);
		
		
		/**String listString = String.join(" ", Word.getIndex("Hello", "L"));
		System.out.println(listString);**/
	}

}
