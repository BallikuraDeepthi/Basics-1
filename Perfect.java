package basics;

import java.util.Scanner;

public class Perfect {
	int sum;
	int perfect(int num) {
		 sum=0;

		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				sum=sum+i;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int a=sc.nextInt();
		Perfect X=new Perfect();
		X.perfect(a);
		System.out.println(X.sum);
		if(a==X.sum) {
			System.out.println("its a perfect number");
			
		}else {
			System.out.println("not a perfect number");
		}
		
		
	}

}

