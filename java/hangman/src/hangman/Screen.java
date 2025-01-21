package hangman;

public class Screen {
	public void clear () {
		//Clears the screen
		System.out.print("\033[H\033[2J");  
		//Resets the cursor to the top of the screen
		System.out.flush();  
	}
	
	public static void hangmanDraw(int gameState) {
		//draws the "hangman", depending on the value of gameState
		switch (gameState) {
		case 0:
			//empty
			break;
		case 1:
			//floor
			System.out.println(
					  "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "_____________");
			break;
		case 2:
			//gallows
			System.out.println(
					  "     ________\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 3:
			//rope
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 4:
			//head
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |        O\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 5:
			//body
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |        O\n"
					+ "    |        |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 6:
			//left arm
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |       \\O\n"
					+ "    |        |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 7:
			//right arm
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |       \\O/\n"
					+ "    |        |\n"
					+ "    |\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 8:
			//left leg
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |       \\O/\n"
					+ "    |        |\n"
					+ "    |       /\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		case 9:
			//right leg
			System.out.println(
					  "     ________\n"
					+ "    |        |\n"
					+ "    |        |\n"
					+ "    |       \\O/\n"
					+ "    |        |\n"
					+ "    |       / \\\n"
					+ "    |\n"
					+ "    |\n"
					+ "____|________");
			break;
		}
	}

}
