package basics;

public class Arrayminmax {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a[]= {1,2,3,4,5,6};
		int min= a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
			min=a[i];
		}
		if(a[i]>max) {
		max=a[i];
				
			}
	}
		
	System.out.println("minimum number:"+min);
	System.out.println("maximum number:"+max);



	}
	}


