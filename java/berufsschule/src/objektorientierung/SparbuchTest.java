package objektorientierung;

import java.util.Scanner;

public class SparbuchTest {
	public static void main(String[] args) {
		boolean end = false;
		byte action;
		Scanner scan = new Scanner(System.in);
		Sparbuch sparbuch = new Sparbuch();
		
		System.out.println("Enter your name: ");
		String name = scan.next();
		
		while (end == false) {
			System.out.println("Welcome " + name + ". What would you like to do?\n\n"
					+ "(1) Display current balance\n"
					+ "(2) Post new transaction\n"
					+ "(3) Show current interest\n"
					+ "(4) End program");
			action = (byte) scan.nextInt();
			
			switch (action) {
			case 1:
				System.out.println("Current balance: " + sparbuch.getBalance() + " €\n");
				break;
			case 2:
				System.out.println("Enter amount to post. Enter negative value to withdraw.");
				double postAmount = scan.nextDouble();
				System.out.println(sparbuch.post(postAmount));
				break;
			case 3:
				System.out.println("Current interest: " + sparbuch.calcInterest());
				break;
			case 4:
				end = true;
			}
		}
		
		scan.close();
		
	}

}
