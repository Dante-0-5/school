package grundlagen;

import java.util.Scanner;
import java.math.BigInteger;

public class Gerade_Ungerade {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		BigInteger dividend = BigInteger.valueOf(2);
		
		System.out.println("Enter a positive, whole number:");
		BigInteger number = new BigInteger(scan.next());
		
		 BigInteger even_odd = number.mod(dividend);
		
		if (even_odd.compareTo(BigInteger.ZERO) == 0) {
			System.out.println("Number is even!");
		} else if (even_odd.compareTo(BigInteger.ONE) == 0) {
			System.out.println("Number is odd!");
		}
		
		scan.close();
	}

}
