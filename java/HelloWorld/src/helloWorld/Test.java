package helloWorld;

public class Test {
	public static void main (String [] args) {
		System.out.println(Test.indexTest("Test", "e"));

	}
	
	public static int indexTest(String secretWord, String guess) {
		return secretWord.indexOf(guess);
	}
}
