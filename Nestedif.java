package basics;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter yor num");
		int x = sc.nextInt();

		if (x % 3 == 0) {
			System.out.println("fizz");
			// System.out.println("enter your num");
			if (x % 5 == 0) {
				System.out.println("buzz");
				// System.out.println("enter your num");
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println("fizzbuzz");
				} 
			}
		}
		else {
			System.out.println("print number itslef");

		}
	}

}
