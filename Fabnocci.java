package basics;

import java.util.Scanner;

public class Fabnocci {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1+""+n2);
		int n3=0;
		for(int i=0;i<=a;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			sc.close();
		}

	}

}
