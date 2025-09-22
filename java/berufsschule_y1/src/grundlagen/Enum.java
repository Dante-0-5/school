package grundlagen;

import java.util.Scanner;

enum month {
	January,
	February,
	March,
	April,
	May,
	June,
	July,
	August,
	September,
	October,
	November,
	December,
}

public class Enum {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a month:");
			month season = month.valueOf(scan.next());
			
		switch (season) {
			case March:
			case April:
			case May:
				System.out.println("It's Spring!");
				break;
			case June:
			case July:
			case August:
				System.out.println("It's Summer! I got my hat on backwards, and it's time to fucking party. *clang*");
				break;
			case September:
			case October:
			case November:
				System.out.println("It's Autumn!");
				break;
			case December:
			case January:
			case February:
				System.out.println("It's Winter!");
				break;
			default:
		}
		
	}
}
