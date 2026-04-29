package basics;

public class Pattren1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		for(int i=1;i<=6;i++) {
			char a='$';
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
				
			}
			System.out.println();
		}

	}

}
