package berufsschule;

import java.util.Scanner;

public class Prämien {
	public static void main (String [] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanString = scanInt;
		
		System.out.println("Bonus calculator v.1. Enter your name:");
		String name = scanString.next();
		
		System.out.println("Enter your age:");
		int age = scanInt.nextInt();
		
		System.out.println("How many whole years have you been with the firm?");
		int timeWithFirm = scanInt.nextInt();
		
		int bonus = 0;
		
		if (age > 35) {
			bonus = bonus + 50;
		}
		
		if (timeWithFirm >= 25) {
			bonus = bonus + 500;
		}
		
		if (bonus == 0) {
			System.out.println("Apologies, " + name + ". You are not eligible for a bonus at this time.");
		} else if (bonus > 0) {
			System.out.println("Congratulations, " + name + "! You are eligible for a bonus of " + bonus + "€!");
		}
	}

}
