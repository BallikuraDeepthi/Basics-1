package basics;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}

	}

}
