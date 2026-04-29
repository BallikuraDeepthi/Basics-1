package com.project.Atm;

import java.util.Scanner;

public class SBIbank implements Bank{

	private User user;
	private Scanner scn=new Scanner(System.in);
	
	public SBIbank(User user)
	{
		this.user=user;
	}

	public void checkbalance() {
		
		System.out.println("you are balnce is : "+user.getAmount());
	}

	
	public void withdrawamount() {
		
		System.out.println("Enter your amount : ");
		double amount = scn.nextDouble();
		if(amount<=0) {
			System.out.println(amount+" : this amount is invalid :: Please enter valid amount");
		}
		else if(amount>user.getAmount()){
			System.out.println(amount+" : insufficent funds !!!!!!");
		}
		else {
			user.setAmount(user.getAmount()-amount);
			System.out.println(amount+" amount is withdrawn successfully !!!!!");
		}
	}

	
	public void deposite() {
		System.out.println("Enter your amount : ");
		double amount = scn.nextDouble();
		if(amount<=0) {
			System.out.println(amount+" : this amount is invalid :: Please enter valid amount");
		}
		
		else {
			user.setAmount(user.getAmount()+amount);
			System.out.println(amount+" amount is deposite successfully !!!!!");
		}
		
	}


	public void changepin() {
		
		System.out.println("Enter your Old Pin : ");
		int oldpin = scn.nextInt();
		if(oldpin==user.getPin()) {
			System.out.println("Enter your new Pin : ");
			int newpin = scn.nextInt();
			if(newpin==oldpin) {
				System.out.println("your new pin is not same as your old pin !!!");
			}
			else {
				user.setPin(newpin);
				System.out.println("your pin is updated successfully !!!");
			}
		}
	}

	
	public void enqiery() {
		 System.out.println("***** Account Details *****");
	        System.out.println("Account Holder : " + user.getName());
	        System.out.println("Account Number : " + user.getAccountnumber());
	        System.out.println("Available Balance : " + user.getAmount());
	        System.out.println("****************************");
		
	}

}
