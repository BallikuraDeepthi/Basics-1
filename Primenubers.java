package basics;

public class Primenubers {

	public static void main(String[] args) {
		// prime numbers in a given numbers
		System.out.println("main method started");
		int  n =10;
		boolean isPrime=true;
		if(n<=1) {
			isPrime=false;
		}else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
				isPrime=false;
				break;
			}
		}

	}
	if (isPrime) {
		System.out.println(n+"is prime");
	}else {
		System.out.println(n +"not a prime");
		
		}

}
}
