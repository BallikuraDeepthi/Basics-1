package basics;

import java.util.Scanner;

public class Elseif1 {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your marks:");
	int marks=sc.nextInt();
	if(marks>=90) {
		System.out.println("A grade");
		}
		else if(marks>=80) {
			System.out.println("b grade");
		}
			else if(marks>=70) {
				System.out.println("c grade");
			}
	
else {
				System.out.println("passed");
				
		}
		
			
	}
	}


