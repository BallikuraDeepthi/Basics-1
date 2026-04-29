package basics;

import java.util.Scanner;

public class Jaggedarray {

	public static void main(String[] args) {
		System.out.println(" main method started:");
		Scanner sc=new Scanner(System.in);
		int [][]jagged= {
				{1,2},
				{3,4,5},
				{6}
		};
		
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}

	}

}
