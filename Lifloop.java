package basics;

import java.util.Scanner;

public class Lifloop {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++) {
			System.out.println(i);
		if(n%i==0)
			System.out.println(i);
		}
			
System.out.println(n);
	}
}

