package com.bank;

public class BANK {
	int balance;
	String name;
	static int Accountnumber=1234;
	{
		Accountnumber++;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("person1 details");
		BANK B1 = new BANK();
		B1.balance=5000;
		B1.name="karthi";
		System.out.println("balance:" + B1.balance);
		System.out.println("name:" + B1.name);
		System.out.println("accountnumber:" + Accountnumber);
		System.out.println("person2 details");
		BANK B2 = new BANK();
		B2.balance=5000;
		B2.name="deepthy";
		System.out.println("balance:" + B2.balance);
		System.out.println("name:" + B2.name);
		System.out.println("accountnumber:" + Accountnumber);
		
		

	}

}
