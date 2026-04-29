package basics;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int r=sc.nextInt();
		for (int i=1;i<=r/2;i++) {
			if(r%i==0)
			System.out.println(i);
		}

	}

}
