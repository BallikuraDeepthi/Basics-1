package basics;

import java.util.Scanner;

public class Recurssivenumber {
	static int recurssivenumber(int n) {
		if(n==1||n==7) {
		return 7;
		}
		return n+recurssivenumber (n-1);
		
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=7;i++) {
			n=7;
			if(n%i==0&&n%i!=7);
			System.out.println("it is a prime number");
			
		}
		int fact=recurssivenumber(n);
		System.out.println(""+fact);
		sc.close();

	}

}

