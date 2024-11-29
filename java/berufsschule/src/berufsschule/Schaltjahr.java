package berufsschule;

import java.util.Scanner;

public class Schaltjahr {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		boolean leapyear = false;
		
		System.out.println("Leap year calculator v.1. Enter year to be checked:");
		int year = scan.nextInt();
		
		if (year%4 == 0) {
			leapyear = true;
		}
		
		if (year%100 == 0) {
			leapyear = false;
		}
		
		if (year%400 == 0) {
			leapyear = true;
		}
		
		if (leapyear == true) {
			System.out.println("The year " + year + " is a leap year.");
		} else {
			System.out.println("The year " + year + " is not a leap year.");
		}
		
		scan.close();
	}

}
