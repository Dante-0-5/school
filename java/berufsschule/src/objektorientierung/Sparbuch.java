package objektorientierung;

import java.lang.Math;

public class Sparbuch {
	private double balance;
	private float interestRate;
	private String name;
	
	Sparbuch(String name, double balance, float interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.name = name;
	}
	
	public String post(double amount) {
		if (balance + amount >= 0) {
			balance = balance + amount;
			return "Posting successful! New balance: " + balance;
		} else {
			return "Posting unsuccessful.";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public float getInterestRate() {
		return interestRate;
	}
	
	public double calcInterest() {
		return Math.round((balance * interestRate) * 100) / 100;
	}

}
