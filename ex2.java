package basics;

import java.util.Scanner;

public class ex2{

	public static void main(String[] args) {
		System.out .println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++) {

				fact=fact*i;
			System.out.println("factorial is :"+n+":"+fact);
			
		
		sc.close();
		

	}

}
}

