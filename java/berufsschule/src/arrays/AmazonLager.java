package arrays;

import java.util.Scanner;

public class AmazonLager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] storage = new String[3][4];
		int row = 0;
		int column = 0;
		
		storage[0][0] = "Laptop";
		storage[0][1] = "Printer";
		storage[0][2] = "Desktop PC";
		storage[0][3] = "Tablet";
		
		storage[1][0] = "MP3 player";
		storage[1][1] = "iPhone";
		storage[1][2] = "Samsung Smartphone";
		
		storage[2][0] = "Monitor";
		storage[2][1] = "Router";
		
		System.out.println("Please enter row [1 - 3] and column [1 - 4], separated by a whitespace. Enter 'p' to print the inventory.");
		
		try {
			row = scan.nextInt();
			column = scan.nextInt();
			
			System.out.println(storage[row-1][column-1]);
			if (row == 1) {
				System.out.println("Product is on sale.");
			}
		} catch (Exception InputMismatchException) {
			switch (scan.next()) {
			case "p":
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 4; j++) {
						if (j != 3) {
							if (storage[i][j] != null && storage[i][j].length() > 16) {
								System.out.print(storage[i][j] + "\t");
							} else if (storage[i][j] != null && storage[i][j].length() > 8) {
								System.out.print(storage[i][j] + "\t\t");
							} else {
								System.out.print(storage[i][j] + "\t\t\t");
							}
						} else {
							System.out.print(storage[i][j] + "\n");
						}
					}
				}
			}
		}
		
	}

}
