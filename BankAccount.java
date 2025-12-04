package com.codegnan.oopexamples;

public class BankAccount {
	private String account_holder;
	private long account_number;
	private double balance;
	public void setter(String account_holder, long account_number, double balance) {
		this.account_holder=account_holder;
		this.account_number=account_number;
		this.balance=balance;		
	}public String getHolder() {
		return account_holder;
		
	}
	public String getAccount_holder() {
		return account_holder;
	}
	
	public long getAccount_number() {
		return account_number;
	}
	
	public double getBalance() {
		return balance;
	}
	public void create_account() {
		System.out.println("Account Holder Name:"+ account_holder);
		System.out.println("Account Number: "+account_number);
		System.out.println("Balance:"+balance);
		
	}public void deposit(double amt) {
		if (amt>=100 && amt%100==0) {
		System.out.printf("Balance:%0.2f",balance+=amt);
		}else System.out.println("enter valid amount");
	}
	public void withdraw(double amt) {
		if(amt<=balance) {
			System.out.println("Withdraw Successfully");
			System.out.println(balance-=amt);
		}
		else System.out.println(" insufficient funds");
		
	}

}