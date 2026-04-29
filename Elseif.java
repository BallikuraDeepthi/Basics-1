package basics;

import java.util.Scanner;

public class Elseif {
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("welcome to nawkari");
		System.out.println("enter your experience");
		
		int experience=sc.nextInt();
		System.out.println("enter your primary skill:");
		String skill=sc.next();
		System.out.println("enter your secondary skill:");
		String skills1=sc.next();
		if(experience>=5) {
		System.out.println("you are eligible");
		System.out.println("enter the languages you know");
		String languageknown=sc.next();
		System.out.println("Enter ur CTC");
		int CTC=sc.nextInt();


			
			if(CTC<=300000) {
				System.out.println("okay with your expections");
			} else if(CTC>=300000) {
				System.out.println("sorry not a you expected");
					
				}
			else {
				System.out.println("you are not eligible");
				
			
			
			
				
			}
			}

			
		}
		
	}


