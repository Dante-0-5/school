package experiments;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		ArrayList<Long> index = new ArrayList<Long>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number you would like to check:");
		
		long number = scan.nextLong();
		
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				index.add(i);
			}
		}
		
		String indexString = index.toString();
		indexString = indexString.replace("[", "");
		indexString = indexString.replace("]", "");
		
		if (index.isEmpty() == false) {
			System.out.println(number + " is not a prime number. It is divisible by " + indexString);
		} else {
			System.out.println(number + " is a prime number.");
		}
		
		scan.close();
	}

}
