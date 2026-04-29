package basics;

public class Pattren3 {

	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {//for rows
		for(int j=1;j<=i;j++) {//for coloums
			 {
				
			
			System.out.print(" ");
			}
			for(int h1=1;h1<=2*(n-1);h1++)
				System.out.print("*");
			}
				
		}
		System.out.println();
	
	for(int k=n;k>=1;k--) {
		for (int m=n;m<=k;m++) {
			
				System.out.print(" ");
			}
			for(int h=n;h<=2*(n-1);h++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	}


