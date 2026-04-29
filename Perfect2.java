package basics;

import java.util.Scanner;

public class Perfect2 {

	public static void main(String[] args) {
		

		for (int num = 1; num <= 1000; num++) {
			
                     if(isperfect(num)) {
                    	 System.out.println(num);
                     }
			
			}
	}
		public static boolean isperfect(int num) {
			int sum=0;
			for (int i = 1; i <= num / 2; i++) {
				if (num%i == 0) {
					sum += i;

				}
		}
			return num==sum;
		}

}
