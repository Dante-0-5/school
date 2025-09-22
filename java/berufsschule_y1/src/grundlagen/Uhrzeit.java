package grundlagen;

import java.util.Scanner;

public class Uhrzeit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int minutes = 0;
		int seconds = 0;
		
		scan.useDelimiter(":|\n");
		
		while (scan.hasNext()) {
			minutes = scan.nextInt();
		}
		
		while (scan.hasNext()) {
			seconds = scan.nextInt();
		}
			

		
		System.out.println(":" + minutes + ":" + seconds + ":");
	}

}
