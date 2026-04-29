package basics;

import java.util.Scanner;

public class Loopex1 {
	
	public static void main(String[] args) {
		System.out .println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		

	
	int sum=1;
	
	for(int i=1;i<=n;i++) {
		
			sum=sum*i;
			System.out.println("factorial of:"+n+"is"+sum);
		}
	}
}
			
	

	

