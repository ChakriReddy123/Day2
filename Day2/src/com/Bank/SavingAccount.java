package com.Bank;

public class SavingAccount extends Account {
	public final double minBalance=500;
	public void withdraw(double money) {
		if(super.getBalance() - money >= 500) {
			super.withdraw(money);
			System.out.println(money + " Amount withdrawn");
		}
		else {
			System.out.println("Cant withdraw");
		}
	}
	
	
}
