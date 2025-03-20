package arrays;

import java.util.Scanner;
import java.util.HashMap;

public class SockenInputHashMap {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		int day = 1;
		
		HashMap<Integer, String> socks = new HashMap<Integer, String>();
		socks.put(1, "red");
		socks.put(2, "blue");
		socks.put(3, "green");
		socks.put(4, "yellow");
		socks.put(5, "purple");
		socks.put(6, "mint green");
		socks.put(7, "turquoise");
		
		while (day != 0) {
			System.out.println("Enter a number to select a day of the week (1 = Mon, 7 = Sun). Enter 0 to exit.");
			day = scan.nextInt();
			
			if (day != 0) {
				System.out.println("Today, wear " + socks.get(day) + " socks.");
				
			}
		}
	}
}
