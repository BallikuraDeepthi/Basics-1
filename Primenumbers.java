package basics;

public class Primenumbers {

	public static void main(String[] args) {
	int a[][]= {
			{ 1,1,0},
			{1,1,1},
			{0,1,1}
			
	};
	int rows=a.length;
	int cols=a[0].length;
	int b[][]=new int[3][3];
	for (int i=1;i<rows-1;i++) {
		for(int j=1;j<cols;j++) {
			if(a[i-1][j]==1 &&
					a[i+1][j]==1 &&
					a[i][j-1]==1 &&
					a[i][j+1]==1) {
				    b[i][j]=1;
			}
		}
	}
	for (int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
		
	}

	}
}
