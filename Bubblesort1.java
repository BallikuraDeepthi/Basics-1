package basics;

public class Bubblesort1 {

	public static void main(String[] args) {
		System.out.println("main method started:");
		int temp=0;
		int []arr= {2,7,9,5,3,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] >arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
				System.out.println("after sorted");
				
					for(int x:arr) {
						System.out.println(x+" ");
				}
				
					
				}
			
				}
			
		
				
				
				
				
				
				
				
			
	


