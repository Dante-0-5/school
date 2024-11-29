package berufsschule;

import java.util.Scanner;

public class Jahreszeiten_v2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a month:");
		String month = scan.next();
		
		switch (month) {
			case "March":
			case "April":
			case "May":
				System.out.println("It's Spring!");
				break;
			case "June":
			case "July":
			case "August":
				System.out.println("It's Summer!");
				break;
		}
	}

}
