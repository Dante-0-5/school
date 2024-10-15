package berufsschule;

import java.util.Scanner;

public class VariablenÜbung {
	public static void main (String [] args) {
		Scanner scanString = new Scanner(System.in);
		Scanner scanByte = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = scanString.next();
		
		System.out.println("Enter your age:");
		byte age = scanByte.nextByte();
		
		System.out.println("Enter your gender: (m/w/d)");
		String genderString = scanString.next();
		char genderChar = genderString.charAt(0);
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + genderChar);
		
		scanString.close();
		scanByte.close();
		
	}

}
