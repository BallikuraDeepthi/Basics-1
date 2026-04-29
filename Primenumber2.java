package basics;

public class Primenumber2 {

	public static void main(String[] args) {
		// finding the prime number with the max number
		System.out.println("main method started");
		int max=10;
		for(int i=2;i<=max;i++) {
			boolean isprime=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					isprime=false;
					break;
					
				}
					
			}
			if(isprime) {
		System.out.println(i);
 
			}
		}

	}

}
