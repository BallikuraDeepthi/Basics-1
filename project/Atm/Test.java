package com.project.Atm;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		User deepu = new User(1, "deepu", 2000, "12345", 4321);
		SBIbank bank;
		 Scanner scn= new Scanner(System.in);
		boolean flag=true;
		System.out.println("enter the the accountnumber");
		String acnum = scn.nextLine();
		System.out.println("enter the the pin");
		int pin = scn.nextInt();
		if(acnum.equals(deepu.getAccountnumber()) && pin==deepu.getPin()) {
			bank=new SBIbank(deepu);
		while(flag) {
			System.out.println("----------------------------------------------");
			System.out.println("1.check balance \n2.withdrawamount \n3.deposite \n4.changepin\n5.enqiery\n6.Exit");
			int n = scn.nextInt();
			switch (n) {
			case 1: {
				
				bank.checkbalance();
				break;
				
			}
			case 2:{
				bank.withdrawamount();
				break;
			}
			case 3:{
				bank.deposite();
				break;
			}case 4:{
				bank.changepin();
				break;
			}
			case 5:{
				bank.enqiery();
				break;
			}
			case 6:{
				System.out.println("thank you wisting us !!!!");
				System.out.println(deepu.getName()+" okay byeeeee");
				return;
			}
			default:
				System.out.println("not a valid a number check once give the correct number ");
			}
			System.out.println("---------------------------------------------------------");
			
		}
	
		
	}else {
		System.out.println("not a valid details");
	}
	}
	
}
