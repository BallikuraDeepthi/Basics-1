package basics;

import java.util.Scanner;

public class Nestedeif2 {

	public static void main(String[] args) {
		System.out.println("main  method started");
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater");
			} else { 
				System.out.println("c is greater");
			}
		}else {
			if(b>c) {
			System.out.println("b is greater");
			} else {
				System.out.println("c is greater");
			}
		}

}
}
		

	


