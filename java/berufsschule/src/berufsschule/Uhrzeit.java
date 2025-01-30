package berufsschule;

import java.util.Scanner;

public class Uhrzeit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.useDelimiter(":|\n");
				
		int minutes = scan.nextInt();
		int seconds = scan.nextInt();
		
		System.out.println(":" + minutes + ":" + seconds + ":");
	}

}
