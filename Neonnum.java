package basics;

import java.util.Scanner;

public class Neonnum {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sq = n * n;
		int sum = 0;
		while (sq > 0) {
			sum += sq % 10;
			sq = sq / 10;
		}
		if (sum == n) {
			System.out.println("its a neon number");
		} else {
			System.out.println("not a neon number");
		}
	}

}
