package objektorientierung;

import java.lang.Math;

public class Sparbuch {
	private double balance = 1000;
	private float interestRate = 0.55f;
	
	public String post(double amount) {
		if (balance + amount >= 0) {
			balance = balance + amount;
			return "Posting successful! New balance: " + balance;
		} else {
			return "Posting unsuccessful.";
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double calcInterest() {
		return Math.round((balance * interestRate) * 100) / 100;
	}

}
