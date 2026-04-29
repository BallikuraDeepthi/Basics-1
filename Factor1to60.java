package basics;

public class Factor1to60 {

	public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("even factors 60 in between 1 to 100");
	for(int i=1;i<=100;i++) {
		int n=60;
		if(n%i==0) {
			System.out.println(i);
			
		}
	}

	}

}
