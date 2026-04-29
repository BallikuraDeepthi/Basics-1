package basics;

import java.util.Scanner;

public class Loop4 {
	
	void Loop4(int n){
		int fact=1;
		for(int i=1;i<=n;i++) {
		
				fact=fact*i;
				System.out.println("factorial of a number is :"+n+":"+fact);
			}
			
		}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		Loop4 x=new Loop4();
		x.Loop4(n);
		

	}

}
