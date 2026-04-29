package basics;

public class Array001 {

	public static void main(String[] args) {
		// to print all the elements in the array,sum,min,max,even,odd
		System.out.println("main method started");
		int a[]= {1,2,3,4,5,6,7,8};
		//int sum=0;
		//int avg=0;
		//for(int i=0;i<a.length;i++) {
			//sum=sum+a[i];
					
			//System.out.println("element="+sum);
		//int min=a[0];
		//for(int i=1;i<a.length;i++) {
			//if (a[i]<min) 
				//min=a[i];
			//}
			//System.out.println("max num:"+min);
		int evnum =0;
		int onum=0;
		for(int i: a) {
			if(i%2==0) {
				evnum++;
			}else onum++;
			}
				System.out.println("even:"+evnum);
				
				
			}
		
		
				
		}
		

	


