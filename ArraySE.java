package basics;

public class ArraySE {
	//searching of elements

	public static void main(String[] args) {
		System.out.println("main method started");
		int a[]= {10,20,30,40,50};
		int key =10;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				found=true;
				break;
				
			}
		}
		if(found)System.out.println("found");
		else System.out.println("not found");

	}

}
