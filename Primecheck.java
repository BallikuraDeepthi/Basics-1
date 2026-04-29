package basics;

public class Primecheck {

	public static void main(String[] args) {
		System.out.println("main method started:");
		int n=6;
		boolean prime=true;
		if(n<2) {
			prime =false;
		}else {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				prime=false;
				break;
			}	
			}
			if(prime) {
				System.out.println("prime number");
			}else {
				System.out.println("not a prime number");
			}
		}

	}
}


