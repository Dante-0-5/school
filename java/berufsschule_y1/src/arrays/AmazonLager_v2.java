package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class AmazonLager_v2 {
	public static String[][][] storage = new String[3][4][3];
	
	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanString = new Scanner (System.in);
		
		int column = 0;
		int row = 0;
		int depth = 0;
		String InvPrintFormat = "| %-25s | %-25s | %-25s | %-25s |%n";
		ArrayList<Integer> lookupLocation = new ArrayList<Integer>();
		String lookupItem;
 		
		storage[0][0][0] = "Laptop"; 			storage[0][1][0] = "Printer"; 		storage[0][2][0] = "Desktop PC"; 			storage[0][3][0] = "Tablet";
		storage[1][0][0] = "MP3 Player";		storage[1][1][0] = "iPhone";		storage[1][2][0] = "Samsung Smartphone";	storage[1][3][0] = null;
		storage[2][0][0] = "Monitor";			storage[2][1][0] = "Router";		storage[2][2][0] = null;					storage[2][3][0] = null;
		
		storage[0][0][1] = "Mouse"; 			storage[0][1][1] = "Keyboard"; 		storage[0][2][1] = "Beamer"; 				storage[0][3][1] = "Document Camera";
		storage[1][0][1] = null;				storage[1][1][1] = null;			storage[1][2][1] = "DisplayPort Cable";		storage[1][3][1] = null;
		storage[2][0][1] = "Switch";			storage[2][1][1] = "Graphics Card";	storage[2][2][1] = "Headset";				storage[2][3][1] = "TV";
		
		storage[0][0][2] = "WiFi Access Point"; storage[0][1][2] = null; 			storage[0][2][2] = "CCTV Camera"; 			storage[0][3][2] = "Cable Receiver";
		storage[1][0][2] = "Ethernet Cable";	storage[1][1][2] = "Headphones";	storage[1][2][2] = "Microphone";			storage[1][3][2] = "Amplifier";
		storage[2][0][2] = "Stylus";			storage[2][1][2] = null;			storage[2][2][2] = "Digital Camera";		storage[2][3][2] = null;
		
		String action = "0";
		boolean actionSelectError = true;
		
		while ((action.equals("4")) == false) {
			actionSelectError = true;
			while (actionSelectError == true) {
				System.out.println("Storage system v.2. Enter number for desired action:\n"
						+ "[1] Lookup by column, row and depth\n"
						+ "[2] Lookup by product name\n"
						+ "[3] Print entire store content\n"
						+ "[4] Exit");
				action = scanInt.next();
				switch (action) {
				case "1":
					actionSelectError = false;
					System.out.println("\nEnter column (1 - 3), row (1 - 4) and depth (1 - 3), seperated by whitespaces.");
					
					try {
						column = scanInt.nextInt() - 1;
						row = scanInt.nextInt() - 1;
						depth = scanInt.nextInt() - 1;
						
					} catch (Exception InputMismatchException) {
						System.out.println("\nInvalid input detected. Please enter an integer.\n");
						scanInt.nextLine();
						break;
					}
					
					try {
						if (storage[column][row][depth] != null) {
							System.out.println("\nSelected Product: " + storage[column][row][depth] + " at column " + (column + 1) + ", row " + (row + 1) + ", depth " + (depth + 1) + ".\n");
						} else {
							System.out.println("\nNo product at column " + (column + 1) + ", row " + (row + 1) + ", depth " + (depth + 1) + ".\n");
						}
						
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("\nArray Index out of bounds. Enter values between 1 and 3 for column, 1 and 4 for row and 1 and 3 for depth respectively.\n");
						break;
					}
					break;
				case "2":
					actionSelectError = false;
					System.out.println("\nEnter item to look up:");
					lookupItem = scanString.nextLine();
					
					lookupLocation = findArrayLocation(lookupItem);
					
					if (lookupLocation.isEmpty()) {
						System.out.println("\nNot found: \"" + lookupItem + "\". Check your input.\n");
					} else {
						System.out.println("\n\"" + lookupItem + "\" found at column " + lookupLocation.get(0) + ", row " + lookupLocation.get(1) + ", depth " + lookupLocation.get(2) + ".\n");
					}
					break;
				case "3":
					actionSelectError = false;	
					for (int i = 0; i < 3; i++) {
						System.out.println("\nDepth " + (i + 1) + ":");
						System.out.print("+---------------------------+---------------------------+---------------------------+---------------------------+\n");
						for (int j = 0; j < 3; j++) {
							System.out.format(InvPrintFormat, storage[j][0][i], storage[j][1][i], storage[j][2][i], storage[j][3][i]);
						}
						System.out.print("+---------------------------+---------------------------+---------------------------+---------------------------+\n");		
					}
					System.out.println();
					break;
				case "4":
					actionSelectError = false;
					
					break;
					
				default:
					actionSelectError = true;
					System.out.println("\nInvalid input: \"" + action + "\". Enter a valid value.\n");
					break;
				}
			}

		}
		
	}
	
	private static ArrayList<Integer> findArrayLocation(String item) {
		ArrayList<Integer> location = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					try {
						if (storage[i][j][k].equalsIgnoreCase(item)) {
							location.add(i + 1);
							location.add(j + 1);
							location.add(k + 1);
						}
					} catch (NullPointerException e) {
						
					}
				}
			}
		}
		return location;
	}

}
