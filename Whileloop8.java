package basics;

import java.util.Scanner;

public class Whileloop8 {
	static boolean findarmstrong(int n) {
		boolean status=false;
		int original=n;
		int r=0;
		int sump=0;
		while(n!=0){
			r=n%10;
			n=n/10;
			sump=sump+r*r*r;
			if(original==sump) {
				status=true;
				break;
				
			}
		}
		
		return status;
	}

	public static void main(String[] args) {
		
System.out.println("main method started");
Scanner sc=new Scanner(System.in);
System.out.println ("enter the number:");
int x=sc.nextInt();
System.out.println(findarmstrong(x));

sc.close();
	}

}
