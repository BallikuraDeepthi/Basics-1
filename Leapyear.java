package basics;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the year");
	int x=sc.nextInt();

	
	 if(x%4==0&&x%100!=0||x%400==0) {
		System.out.println("its a leapyear");
	}else {
		System.out.println("not a leapyear");
		sc.close();
	}

	}

}
