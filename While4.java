package basics;

public class While4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int i=456;
		int d;
		while(i>0) {
		    d=i%10;
			i=i/10;
			System.out.println(d);
		}

	}

}
