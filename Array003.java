package basics;

public class Array003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
////		for each loop;
//		for(int[] x:a) {
//			for(int x1:x) {
//				System.out.print(x1+" ");
//				
//			}
//			System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
				
		}
		
			
		
	}
}

