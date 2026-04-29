package basics;

import java.util.Arrays;

public class Arraymissingnnum {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a[]= {5,8,1,3};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			int diff=a[i+1]-a[i];
			while(diff>1) {

				
				
				
				System.out.println(a[i]+1 +" ");
				diff--;
				a[i]++;
				
			
			}
			
		}
		System.out.println("main method ended");

	

}
}
