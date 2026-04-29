package basics;

import java.util.Scanner;

public class Arraydemo1 {

	public static void main(String[] args) {
	System.out.println("main method started");
	int x[]=new int [5];
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter an elements:");
	int sum=0;
	for(int i=0;i<x.length;i++) {
	 x[i]=sc.nextInt();
	} 
	
	

for(int i=0;i<x.length;i++) {
	sum=sum+x[i];	
}

System.out.println("sum ="+sum);
sc.close();

	}

}
