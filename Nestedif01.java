package basics;

import java.util.Scanner;

public class Nestedif01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		if(number>0) {
			if(number%2==0) {
			System.out.println("positive and even number");
		}else {
			System.out.println("odd number");
	
		}
	} else {
		 	System.out.println("negative number");
		}
	
				

	}

}
