package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetHangmanWords {
	public static String[] get() throws IOException {
		InputStream in = GetHangmanWords.class.getResourceAsStream("words.txt");
		
		InputStreamReader inReader = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inReader);
		
		String[] words = {};
		ArrayList<String> lines = new ArrayList<String>();
		while (reader.readLine() != null) {
			lines.add(reader.readLine());
		}
		
		words = (String[]) lines.toArray();
		return words;
	}

}
