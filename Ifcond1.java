package basics;

import java.util.Scanner;

public class Ifcond1 {

	public static void main(String[] args) {
		System.out.println("man method staretd");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int a= sc.nextInt();
		if(a%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("not a even number");
			sc.close();
		}
			
	}

}
