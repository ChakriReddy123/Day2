package com.Bank;

public class CurrentAccount extends Account {
	double overdraftLimit=5000;
	public void withdraw(double money) {
		if(super.getBalance()-money >= -5000) {
			super.withdraw(money);
			System.out.println(money + " Amount withdrawn");
		}
		else {
			System.out.println("Cant withdraw");
		}
	}
}
