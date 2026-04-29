package basics;

public class Array4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]=new int [a.length + b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			c[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++) {
			c[k]=b[j];
			k++;
		}
		for(int result:c) {
			System.out.println(result+" ");
		}

	}

}
