package basics;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		System.out.println("factors of "+n +"are:");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			System.out.println(i);
			
			}
				
		}

	}

}
