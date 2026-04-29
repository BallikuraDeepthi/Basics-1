package basics;

public class Recur2 {
	static int n;
	static int  recur(int n) {
		if(n==0) {
			return 0;
		}else {
			
			return n+ recur(n-1);
		}
	}
		
	

	public static void main(String[] args) {
		System.out.println("main method started");
		int n=5;
		
		int sum=recur(n);
			System.out.println("sum of first number:"+n+"natural numbers"+"="+sum);
		

	}

}

