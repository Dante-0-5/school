package hangman;

public class Screen {
	public static void hangmanDraw(int gameState) {
		//draws the "hangman", depending on the value of gameState
		switch (gameState) {
		case 0:
			//empty
			System.out.println(
					  "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n");
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
					+ "__________________");
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
					+ "____|_____________");
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
					+ "____|_____________");
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
					+ "____|_____________");
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
					+ "____|_____________");
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
					+ "____|_____________");
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
					+ "____|_____________");
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
					+ "____|_____________");
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
					+ "____|_____________");
			break;
		}
	}
	
	public static void drawUI(boolean gameOver) {
		if (gameOver == false) {
			//writes "HANGMAN" in a fancy big ASCII thingy
			System.out.println("_  _ ____ _  _ ____ _  _ ____ _  _ \r\n"
					+ "|__| |__| |\\ | | __ |\\/| |__| |\\ | \r\n"
					+ "|  | |  | | \\| |__] |  | |  | | \\| \r\n"
					+ "                                   ");
		} else {
			//writes "GAME OVER" in a fancy big ASCII thingy
			System.out.println("____ ____ _  _ ____    ____ _  _ ____ ____ \r\n"
					+ "| __ |__| |\\/| |___    |  | |  | |___ |__/ \r\n"
					+ "|__] |  | |  | |___    |__|  \\/  |___ |  \\ \r\n"
					+ "                                           ");
		}
	}
}
