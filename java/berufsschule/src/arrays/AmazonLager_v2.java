package arrays;

import java.util.Scanner;

public class AmazonLager_v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][][] storage = new String[3][4][3];
		
		storage[0][0][0] = "Laptop"; 			storage[0][1][0] = "Printer"; 		storage[0][2][0] = "Desktop PC"; 			storage[0][3][0] = "Tablet";
		storage[1][0][0] = "MP3 Player";		storage[1][1][0] = "iPhone";		storage[1][2][0] = "Samsung Smartphone";	storage[1][3][0] = null;
		storage[2][0][0] = "Monitor";			storage[2][1][0] = "Router";		storage[2][2][0] = null;					storage[2][0][0] = null;
		
		storage[0][0][1] = "Mouse"; 			storage[0][1][1] = "Keyboard"; 		storage[0][2][1] = "Beamer"; 				storage[0][3][1] = "Document Camera";
		storage[1][0][1] = null;				storage[1][1][1] = null;			storage[1][2][1] = "DisplayPort Cable";		storage[1][3][1] = null;
		storage[2][0][1] = "Switch";			storage[2][1][1] = "Graphics Card";	storage[2][2][1] = "Headset";				storage[2][0][1] = "TV";
		
		storage[0][0][2] = "WiFi Access Point"; storage[0][1][2] = null; 			storage[0][2][2] = "CCTV Camera"; 			storage[0][3][2] = "Cable Receiver";
		storage[1][0][2] = "Ethernet Cable";	storage[1][1][2] = "Headphones";	storage[1][2][2] = "Microphone";			storage[1][3][2] = "Amplifier";
		storage[2][0][2] = "Stylus";			storage[2][1][2] = null;			storage[2][2][2] = "Digital Camera";		storage[2][0][2] = null;
		
		String action = "0";
		boolean actionSelectError = true;
		
		while ((action.equals("4")) == false) {
			while (actionSelectError = true) {
				System.out.println("Storage system v.2. Enter number for desired action:\n"
						+ "[1] Lookup by row, column and depth\n"
						+ "[2] Lookup by product name\n"
						+ "[3] Print entire store content\n"
						+ "[4] Exit");
				action = scan.next();
				switch (action) {
				case "1":
					actionSelectError = false;
					break;
				case "2":
					actionSelectError = false;
					break;
				case "3":
					actionSelectError = false;
					break;
				case "4":
					actionSelectError = false;
					break;
					
				default:
					actionSelectError = true;
					System.out.println("Invalid input: \"" + action + "\". Enter a valid value.");
					break;
				}
			}

		}
		
	}

}
