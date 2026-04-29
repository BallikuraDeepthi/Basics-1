package basics;

public class Arraytranspose {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int rows=arr.length;
		int coloumns=arr[0].length;
		int Arraytranspose[][]=new int [rows][coloumns];
		
	
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumns;j++) {
				Arraytranspose[j][i]=arr[i][j];
			}
			
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumns;j++) {
				System.out.print(Arraytranspose[i][j]+" ");
			}
			System.out.println();
 }

}
}