package grundlagen;

import java.util.Scanner;

public class Jahreszeiten {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a month: ");
		String month = scan.next();
		
		if (month.equalsIgnoreCase("March") | month.equalsIgnoreCase("April") | month.equalsIgnoreCase("May")) {
			System.out.println("It's Spring!");
		} else if (month.equalsIgnoreCase("June") | month.equalsIgnoreCase("July") | month.equalsIgnoreCase("August")) {
			System.out.println("It's Summer! I got my hat on backwards, and it's time to fucking party! *clang*");
		} else if (month.equalsIgnoreCase("September") | month.equalsIgnoreCase("October") | month.equalsIgnoreCase("November")) {
			System.out.println("It's Autumn!");
		} else if (month.equalsIgnoreCase("December") | month.equalsIgnoreCase("January") | month.equalsIgnoreCase("February")) {
			System.out.println("It's Winter!");
		} else {
			System.out.println("No valid input detected! Please enter a month.");
		}
	}

}
