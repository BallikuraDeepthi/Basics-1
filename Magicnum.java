package basics;

import java.util.Scanner;

public class Magicnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("main method started");
int n=sc.nextInt();
int num=n;
while(num!=0&&num!=4) {
	int sum=0;
	while(num>0) {
		int digit=num%10;
		sum=sum+(digit*digit);
		num=num/10;
		if(num==1) {
			System.out.println("happy number");
		}else {
			System.out.println("not a happy number");
			sc.close();	 
			
		}
	}
		
}
	}

}
