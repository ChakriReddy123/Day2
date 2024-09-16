package com.Bank;

public class Account {
	private long accNum;
	private double balance;
	private Person 	accHolder;
	public void deposit(double money) {
		this.balance+=money;
	}
	public void withdraw(double money) {
		this.balance-=money;
	}
	public double getBalance() {
		
		return this.balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
