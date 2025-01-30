package berufsschule;

import java.lang.Math;

public class FizzBuzz {
	public static void main(String[] args) {
		int number;
		
		for (int i = 0; i < 10; i++) {
			number = (int) (Math.random()*100+1);
			
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(number);
			}
		}
		
	}

}
