package com.Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long acc=1000;
		Person p1=new Person();
		p1.setName("smith");
		p1.setAge(21);
		CurrentAccount s1=new CurrentAccount();
		s1.setAccNum(++acc);
		s1.setAccHolder(p1);
		s1.setBalance(2000);
		Person p2=new Person();
		p2.setName("kathy");
		p2.setAge(20);
		CurrentAccount s2=new CurrentAccount();
		s2.setAccNum(++acc);
		s2.setAccHolder(p2);
		s2.setBalance(3000);
		
		System.out.println("Depositing 2000 in smith acount ");
		s1.deposit(2000);
		System.out.println("withdrawing 2000 from kathy acount ");
		s2.withdraw(5000);
		
		System.out.println("The remaining balance in smith account :"+ s1.getBalance());
		
		System.out.println("The remaining balance in kathy account :"+s2.getBalance());
		
		
		
	}

}
