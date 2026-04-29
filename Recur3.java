package basics;

import java.util.Scanner;

public class Recur3 {
	static int recur3(int n) {
		if(n==0 || n==1) {
		return 1;
	}else {
        return n*recur3(n-1);
}
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int n=sc.nextInt();
		int a=recur3(n);
		System.out.println("factorial of:"+n+"="+a);
		

	}

}
