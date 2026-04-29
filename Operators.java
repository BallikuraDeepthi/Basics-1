package basics;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A value:");
		int a=sc.nextInt();
		System.out.println("enter B value:");
		int b=sc.nextInt();
		System.out.println("sum of two numbers:"+(a+b));
		System.out.println("sub of two numbers:"+(a-b));
		System.out.println("mul of two numbers:"+(a*b));
		System.out.println("div of two numbers:"+(a/b));
	}

}
