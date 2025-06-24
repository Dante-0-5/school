package oop;

import java.util.ArrayList;

public class Bank {
	public class Account {
		private String name;
		private double balance;
		
		Account() {
			this.name = "Unknown";
			this.balance = 0;
		}
		
		public String getName() {
			return this.name;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
	
	private static ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void transaction(Account account, double value) {
		account.balance = account.balance + value;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Account account1 = bank.new Account();
		Account account2 = bank.new Account();
		Account account3 = bank.new Account();
		
		Bank.accounts.add(account1);
		Bank.accounts.add(account2);
		Bank.accounts.add(account3);
		
		account2.setName("Harald");
		
		bank.transaction(account2, 200);
		bank.transaction(account2, -50);
		
		System.out.println(account2.getBalance());
	}

}
