package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetHangmanWords {
	public static ArrayList<String> get() throws IOException {
		InputStream in = GetHangmanWords.class.getResourceAsStream("words.txt");
		
		InputStreamReader inReader = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inReader);
		
		ArrayList<String> lines = new ArrayList<String>();
		while (lines.contains(null) != true) {
			lines.add(reader.readLine());
		}
		
		lines.removeLast();
	
		return lines;
	}

}
