package basics;

public class Array2sum {

	public static void main(String[] args) {
		System.out.println("main methiod started");
		int a[]= {5,6,7};
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
			
		}
		avg=(double) sum/a.length;
		System.out.println("sum ="+sum);
		System.out.println("avg ="+ avg);
	}

}
