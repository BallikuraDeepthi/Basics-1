package basics;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	
	int rev=0;
	while(num!=0) {
		int n=num%10;
		num =num/10;
		rev=rev*10+n;
		
	}
	System.out.println("reverse number"+rev);
sc.close();
	}

}
