package basics;

public class While2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int i=1;
		int sum =0;
		while(i<=5) {
			
			sum=sum+i;
			i++;
		}
		System.out.println("sum:"+sum);

	}

}
